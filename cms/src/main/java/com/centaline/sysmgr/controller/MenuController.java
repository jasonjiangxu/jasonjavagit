package com.centaline.sysmgr.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.centaline.sysmgr.model.TMenu;
import com.centaline.sysmgr.service.MenuService;
import com.jx.core.controller.BaseController;
import com.jx.core.model.TConfig;

/**
 * 
 * @ClassName: MenuController 
 * @Description: TODO(菜单管理) 
 * @author 姜旭(JasonJiang)
 * @date 2015年7月1日 上午9:11:17 
 *
 */
@Controller
@RequestMapping(value="menu")
public class MenuController extends BaseController{
	
	@Resource(name = "menuService") 
	private MenuService menuService;
	
	/**
	 * 跳转到分页页面
	 * @param model
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "menulist")
	public String menulist(Model model,HttpServletRequest request) throws Exception {
		TConfig config=new TConfig();
		config.setMaintitle("菜单管理");
		config.setSubtitle("菜单列表、管理、跟踪、实时图表分析");
		config.setPosition("系统管理=>菜单管理");
		config.setPosiurl(request.getContextPath()+"/menu/menulist");
		model.addAttribute("config", config);
		return "sysmgr/menulist";
	}
	/**
	 * 分页查询
	 * @param model
	 * @param page
	 * @param rows
	 * @param tm
	 * @param condition
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "findMenuList")
	@ResponseBody
	public String findMenuList(Model model,Integer page,Integer rows,TMenu tm,String condition) throws Exception {
	/*	page=page==null?1:page;
		rows=rows==null?PageUtil.NUM_DEFAULT_PAGE:rows;*/
		/*String[] condis=null;
		if(condition!=null && !"".equals(condition)){
			condis=condition.split(",");
		}*/
		//PageUtil<TMenu> menulist=menuService.findMenusByPage(page, rows, condis, tm);
		String re="{\"total\":7,\"rows\":[{\"id\":1,\"name\":\"All Tasks\",\"parentCode\":\"3/4/2010\",\"level\":\"3/20/2010\",\"progress\":60,\"iconCls\":\"icon-ok\"},"
				+"{\"id\":2,\"name\":\"Designing\",\"begin\":\"3/4/2010\",\"end\":\"3/10/2010\",\"progress\":100,\"_parentId\":1,\"state\":\"closed\"},"
				+ "{\"id\":21,\"name\":\"Database\",\"persons\":2,\"parentCode\":\"3/4/2010\",\"level\":\"3/6/2010\",\"progress\":100,\"_parentId\":2},"
				+ "{\"id\":22,\"name\":\"UML\",\"persons\":1,\"parentCode\":\"3/7/2010\",\"level\":\"3/8/2010\",\"progress\":100,\"_parentId\":2}],\"footer\":["
				+ "{\"name\":\"Total Persons:\",\"persons\":7,\"iconCls\":\"icon-sum\"}]}";
		return re;
	}
	
	/**
	 * 
	 * @Title: findAllParentMenu 
	 * @Description: TODO(查询所有父类菜单) 
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return List<TMenu>    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月18日 下午4:50:26
	 *
	 */
	/*@RequestMapping(value = "findAllParentMenu")
	@ResponseBody
	public List<TMenu> findAllParentMenu() throws Exception{
		List<TMenu> list=menuService.findAllParentMenu();
		return list;
		return null;
	}*/
	
	/**
	 * 
	 * @Title: showQryMenu 
	 * @Description: TODO(查询到明细页面) 
	 * @param @param model
	 * @param @param pkid
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月7日 下午2:00:51
	 *
	 */
	/*@RequestMapping(value = "box/showQryMenu/{pkid}")
	public String showQryMenu(Model model,@PathVariable(value = "pkid") String pkid) throws Exception{
		//根据主键查询 放入对象
		TMenu  tmenu=menuService.findById(pkid);
		model.addAttribute("tmenu", tmenu);
		return "sysmgr/menumgr/showQryMenu";
	}*/
	
	/**
	 * 
	 * @Title: mtnAddMenu 
	 * @Description: TODO(做菜单保存) 
	 * @param @return    设定文件 
	 * @return AjaxResponse    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月2日 下午5:02:04
	 *
	 */
	/*@RequestMapping(value = "mtnAddMenu")
	@ResponseBody
	public AjaxResponse mtnAddMenu(Model model,TMenu menu){
		try {
			//判断同样名称和编码的菜单是否存在
			boolean isExists=menuService.checkExistsByNameCode(menu);
			if(!isExists){//存在返回提示 否则保存
				if(menu.getLevel()==1){//一级菜单 父菜单为0
					menu.setParentCode("0");
				}
				menu.setCreateUser("admin");
				int ret=menuService.saveTMenu(menu);
				if(ret>0){
					return AjaxResponse.success("保存成功！");
				}else{
					return AjaxResponse.fail("保存失败！");
				}
			}else{
				return AjaxResponse.fail("菜单已经存在！");
			}
			return AjaxResponse.fail("菜单已经存在！");
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxResponse.fail("发生错误！");
		}
	}*/
	
	/**
	 * 
	 * @Title: mtnUpdateMenu 
	 * @Description: TODO(更新) 
	 * @param @param model
	 * @param @param menu
	 * @param @return    设定文件 
	 * @return AjaxResponse    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月7日 上午8:44:44
	 *
	 */
	/*@RequestMapping(value = "mtnUpdateMenu")
	@ResponseBody
	public AjaxResponse mtnUpdateMenu(Model model,TMenu menu){
		try {
			TMenu tm=menuService.findById(menu.getId());//查询数据库中的数据
			//数据库中的数据和页面传入的数据比较 
			//如果编码和名称改变了 则判断新的编码和名称在数据库中是否存在 负责没有改变 则直接更新
			if(tm!=null){
				if(!tm.getCode().equals(menu.getCode())){//编码不一样 查询新编码在数据库中是否存在
					TMenu tmcode=menuService.findByCode(menu.getCode());
					if(tmcode!=null){
						return AjaxResponse.fail("菜单编码已经存在！");
					}
				}
				if(!tm.getName().equals(menu.getName())){//名称不一样 查询新名称在数据库中是否存在
					TMenu tmname=menuService.findByName(menu.getName());
					if(tmname!=null){
						return AjaxResponse.fail("菜单名称已经存在！");
					}
				}
				menu.setUpdateUser("root");
				int ret=menuService.updateById(menu);
				if(ret>0){
					return AjaxResponse.success("更新成功！");
				}else{
					return AjaxResponse.fail("更新失败！");
				}
			}else{
				return AjaxResponse.fail("要更新的数据不存在！");
			}
			return AjaxResponse.fail("要更新的数据不存在！");
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxResponse.fail("发生错误！");
		}
	}*/
	
	/**
	 * 
	 * @Title: mtnDelMenus 
	 * @Description: TODO(批量删除菜单) 
	 * @param @param model
	 * @param @param ids
	 * @param @return    设定文件 
	 * @return AjaxResponse    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月6日 下午6:30:14
	 *
	 */
	/*@RequestMapping(value = "mtnDelMenus")
	@ResponseBody
	public AjaxResponse mtnDelMenus(Model model,String[] ids){
		try {
			if(ids.length>0){
				boolean delSuccess=menuService.revomeBatchByIds(ids);
				if(delSuccess){
					return AjaxResponse.success();
				}else{
					return AjaxResponse.fail("删除失败！");
				}
			}else{
				return AjaxResponse.fail("请最少选择一个项目删除！");
			}
			return AjaxResponse.fail("请最少选择一个项目删除！");
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxResponse.fail("发生错误！");
		}
	}*/
}
