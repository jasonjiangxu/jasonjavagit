package com.jx.core.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jx.core.model.TConfig;


/**
 * 
 * @ClassName: IndexController 
 * @Description: TODO(首页进入) 
 * @author 姜旭(JasonJiang)
 * @date 2015年7月29日 上午10:18:43 
 *
 */
@Controller
@RequestMapping
public class IndexController extends BaseController {
	@RequestMapping(value = "index")
	public String indexInfo(Model model,HttpServletRequest request){
		TConfig config=new TConfig();
		config.setMaintitle("系统首页");
		config.setSubtitle("管理、跟踪、实时图表分析");
		config.setPosition("首页");
		config.setPosiurl(request.getContextPath()+"/index");
		model.addAttribute("config", config);
		return "index";
	}
	
	@RequestMapping(value = "index/admin")
	public String indexAdminInfo(Model model,HttpServletRequest request){
		return "adminIndex";
	}
}
