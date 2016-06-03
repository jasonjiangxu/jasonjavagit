package com.centaline.utility.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.centaline.core.controller.BaseController;
import com.centaline.sysmgr.model.TConfig;

@Controller
@RequestMapping(value="utility")
public class UtilityController extends BaseController{

	@RequestMapping(value = "player")
	public String userlist(Model model,HttpServletRequest request)  {
		TConfig config=new TConfig();
		config.setMaintitle("播放器");
		config.setSubtitle("各种播放器的使用，API，操作规范");
		config.setPosition("辅助工具=>播放器");
		config.setPosiurl(request.getContextPath()+"/utility/player");
		model.addAttribute("config", config);
		return "utility/player";
	}
}
