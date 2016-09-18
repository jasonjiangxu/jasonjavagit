package com.jx.sales.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jx.core.controller.BaseController;
import com.jx.core.model.TConfig;
import com.jx.sales.model.TCust;
import com.jx.sales.service.ICustService;
import com.jx.utility.web.PageUtil;

@Controller
@RequestMapping(value="cust")
public class CustController extends BaseController {
	
	@Resource(name = "custService") 
	private ICustService custService;
	
	@RequestMapping(value = "mycustlist")
	public String menulist(Model model,HttpServletRequest request) {
		TConfig config=new TConfig();
		config.setPosition("客户管理=>我的客户");
		config.setPosiurl(request.getContextPath()+"/menu/menulist");
		model.addAttribute("config", config);
		return "customer/custlist";
	}
	
	@RequestMapping(value = "ajaxMyCustList")
	@ResponseBody
	public String findMenuList(Model model,Integer page,Integer rows,String condition){
		page=page==null?1:page;
		rows=rows==null?PageUtil.NUM_DEFAULT_PAGE:rows;
		String[] condis=null;
		if(condition!=null && !"".equals(condition)){
			condis=condition.split(",");
		}
		PageUtil<TCust> menulist=custService.findCustByPage(page, rows, condis, null);
		return objToJson(menulist);
	}
	
	@RequestMapping(value = "ajaxMyCustSave")
	@ResponseBody
	public String ajaxMyCustSave(Model model,TCust cust){
		try {
			int saverow=custService.saveCust(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	@RequestMapping(value = "box/addcust")
	public String addcust(Model model,HttpServletRequest request) {
		return "customer/addcust";
	}
}
