package com.centaline.core.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

/**
 * 
 * @ClassName: BaseController 
 * @Description: TODO(基础控制器) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月29日 下午12:43:05 
 *
 */
public class BaseController {
	
	/**
	 * 
	 * @Title: initPath 
	 * @Description: TODO(初始化基本参数) 
	 * @param @param request
	 * @param @param response
	 * @param @param model    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年6月29日 下午12:43:20
	 *
	 */
	@ModelAttribute
	public void initPath(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		String base = request.getContextPath();
		String fullPath = request.getScheme()+"://"+request.getServerName()+base;  
		model.addAttribute("base", base);
		model.addAttribute("fullPath", fullPath);  
	}
	
	/**
	 * 
	 * @Title: exceptionHandler 
	 * @Description: TODO(异常处理) 
	 * @param @param ex
	 * @param @param response
	 * @param @param request
	 * @param @return
	 * @param @throws IOException    设定文件 
	 * @return ModelAndView    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年6月29日 下午12:43:53
	 *
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionHandler(Exception ex,HttpServletResponse response,HttpServletRequest request) throws IOException{
		String base = request.getContextPath();
		ModelAndView mav = null;
		if(ex.getClass() == NoSuchRequestHandlingMethodException.class){
			mav=new ModelAndView("error/error404");
		}else{
			mav=new ModelAndView("error/error500");
		}
		mav.addObject("ex", ex);
		mav.addObject("base", base);
		return mav;
	}
}
