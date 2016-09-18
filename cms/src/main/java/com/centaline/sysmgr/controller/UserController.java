package com.centaline.sysmgr.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.centaline.sysmgr.model.TUser;
import com.centaline.sysmgr.service.UserService;
import com.jx.core.controller.BaseController;
import com.jx.core.model.TConfig;
import com.jx.utility.web.AjaxResponse;
import com.jx.utility.web.PageUtil;

import net.sf.json.JSONObject;

/**
 * 
 * @ClassName: UserController 
 * @Description: TODO(用户管理控制层) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:45:03 
 *
 */
@Controller
@RequestMapping(value="user")
public class UserController extends BaseController{
	
	@Resource(name = "userService") 
	private UserService userService;
	
	@RequestMapping(value = "userlist")
	public String userlist(Model model,HttpServletRequest request)  {
		TConfig config=new TConfig();
		config.setMaintitle("用户管理");
		config.setSubtitle("用户列表、管理、跟踪、实时图表分析");
		config.setPosition("系统管理=>用户管理");
		config.setPosiurl(request.getContextPath()+"/user/userlist");
		model.addAttribute("config", config);
		return "sysmgr/userlist";
	}
	
	/**
	 * 
	 * @Title: userlist 
	 * @Description: TODO(用户分页查询) 
	 * @param @param model
	 * @param @param currentpage
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年6月29日 下午4:50:20
	 *
	 */
	@RequestMapping(value = "findUserList")
	@ResponseBody
	public String findUserList(Model model,Integer page,Integer rows,TUser tm,String condition) {
		try{
			PageUtil<TUser> userlist=userService.findUser(page, rows, tm,condition);
			JSONObject json=JSONObject.fromObject(userlist);
			return json.toString();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 
	 * @Title: initJobCode 
	 * @Description: TODO(初始化员工工号) 
	 * @param @param model
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月20日 下午6:38:13
	 *
	 */
	@RequestMapping(value = "initJobCode")
	@ResponseBody
	public AjaxResponse initJobCode(Model model) throws Exception {
		/*String code=userService.findNewCode();
		String code="";*/
		return AjaxResponse.success("");
	}
	
	/**
	 * 
	 * @Title: mtnAddUser 
	 * @Description: TODO(用户增加) 
	 * @param @param model
	 * @param @param user
	 * @param @param password
	 * @param @return    设定文件 
	 * @return AjaxResponse    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月21日 下午4:57:39
	 *
	 */
	/*@RequestMapping(value = "mtnAddUser")
	@ResponseBody
	public AjaxResponse mtnAddUser(Model model,TUser user){
		try {
			user.setCreateUser("admin");
			//判断同样名称和编码的菜单是否存在
			boolean isExists=userService.checkExistsByLoginName(user);
			if(!isExists){//存在返回提示 否则保存
				int ret=userService.saveTUser(user);
				if(ret>0){
					return AjaxResponse.success("保存成功！");
				}else{
					return AjaxResponse.fail("保存失败！");
				}
			}else{
				return AjaxResponse.fail("登录名已经存在！");
			}
			return AjaxResponse.fail("登录名已经存在！");
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxResponse.fail("发生错误！");
		}
	}*/
	
	/**
	 * 
	 * @Title: mtnDelUser 
	 * @Description: TODO(批量删除用户) 
	 * @param @param model
	 * @param @param ids
	 * @param @return    设定文件 
	 * @return AjaxResponse    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月22日 下午6:00:01
	 *
	 */
	/*@RequestMapping(value = "mtnDelUser")
	@ResponseBody
	public AjaxResponse mtnDelUser(Model model,String[] ids){
		try {
			if(ids.length>0){
				boolean delSuccess=userService.delBatchByIds(ids);
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
	
	/**
	 * 
	 * @Title: mtnBackUser 
	 * @Description: TODO(回收) 
	 * @param @param model
	 * @param @param ids
	 * @param @return    设定文件 
	 * @return AjaxResponse    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月28日 下午3:57:45
	 *
	 */
	/*@RequestMapping(value = "mtnBackUser")
	@ResponseBody
	public AjaxResponse mtnBackUser(Model model,String[] ids){
		try {
			if(ids.length>0){
				boolean delSuccess=userService.backBatchByIds(ids);
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
	
	/**
	 * 
	 * @Title: mtnMoveUser 
	 * @Description: TODO(彻底删除) 
	 * @param @param model
	 * @param @param ids
	 * @param @return    设定文件 
	 * @return AjaxResponse    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月28日 下午3:58:12
	 *
	 */
	/*@RequestMapping(value = "mtnMoveUser")
	@ResponseBody
	public AjaxResponse mtnMoveUser(Model model,String[] ids){
		try {
			if(ids.length>0){
				boolean delSuccess=userService.revomeBatchByIds(ids);
				if(delSuccess){
					return AjaxResponse.success();
				}else{
					return AjaxResponse.fail("删除失败！");
				}
			}else{
				return AjaxResponse.fail("请最少选择一个项目删除！");
			}
			return AjaxResponse.fail("删除失败！");
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxResponse.fail("发生错误！");
		}
	}*/
	
	/**
	 * 
	 * @Title: mtnEmptyUser 
	 * @Description: TODO(清空) 
	 * @param @param model
	 * @param @return    设定文件 
	 * @return AjaxResponse    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月28日 下午4:08:30
	 *
	 */
	/*@RequestMapping(value = "mtnEmptyUser")
	@ResponseBody
	public AjaxResponse mtnEmptyUser(Model model){
		try {
			boolean delSuccess=userService.emptyRecycel();
			if(delSuccess){
				return AjaxResponse.success();
			}else{
				return AjaxResponse.fail("清空失败！");
			}
			return AjaxResponse.fail("清空失败！");
		} catch (Exception e) {
			e.printStackTrace();
			return AjaxResponse.fail("发生错误！");
		}
	}*/
	
	/**
	 * 
	 * @Title: mtnUpdateUser 
	 * @Description: TODO(更新用户) 
	 * @param @param model
	 * @param @param user
	 * @param @return    设定文件 
	 * @return AjaxResponse    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月22日 下午7:06:41
	 *
	 */
	/*@RequestMapping(value = "mtnUpdateUser")
	@ResponseBody
	public AjaxResponse mtnUpdateUser(Model model,TUser user){
		try {
			TUser tm=userService.findById(user.getId());//查询数据库中的数据
			//数据库中的数据和页面传入的数据比较 
			//如果编码和名称改变了 则判断新的编码和名称在数据库中是否存在 负责没有改变 则直接更新
			if(tm!=null){
				if(!tm.getLoginName().equals(user.getLoginName())){//登录名不一样 查询新编码在数据库中是否存在
					boolean isexist=userService.checkExistsByLoginName(user);
					if(isexist){
						return AjaxResponse.fail("登录名已经存在！");
					}
				}
				user.setUpdateUser("root");
				int ret=userService.updateById(user);
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
	 * @Title: showQryUser 
	 * @Description: TODO(查询用户明细) 
	 * @param @param model
	 * @param @param pkid
	 * @param @return
	 * @param @throws Exception    设定文件 
	 * @return String    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年7月22日 下午6:22:27
	 *
	 */
	/*@RequestMapping(value = "box/showQryUser/{pkid}")
	public String showQryUser(Model model,@PathVariable(value = "pkid") String pkid) throws Exception{
		//根据主键查询 放入对象
		TUser  tuser=userService.findById(pkid);
		model.addAttribute("tuser", tuser);
		return "sysmgr/usermgr/showQryUser";
	}
	*/
	/*@RequestMapping(value = "box/recycle")
	public String recycle(Model model) throws Exception{
		//根据主键查询 放入对象
		return "sysmgr/usermgr/recycle";
	}*/
}
