package com.jx.sales.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jx.core.controller.BaseController;
import com.jx.core.model.TConfig;
import com.jx.sales.service.ICustService;

@Controller
@RequestMapping(value="cust")
public class CustController extends BaseController {
	
	@Resource(name = "custService") 
	private ICustService custService;
	
	@RequestMapping(value = "custlist")
	public String menulist(Model model,HttpServletRequest request) throws Exception {
		TConfig config=new TConfig();
		config.setPosition("客户管理=>我的客户");
		config.setPosiurl(request.getContextPath()+"/menu/menulist");
		model.addAttribute("config", config);
		return "cust/custlist";
	}
}
