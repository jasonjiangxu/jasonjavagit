package com.centaline.core.exception;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * 
 * @ClassName: MySimpleMappingExceptionResolver 
 * @Description: TODO(spring 统一异常处理) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 下午12:39:26 
 *
 */
public class MySimpleMappingExceptionResolver extends SimpleMappingExceptionResolver {

	@Override
	protected ModelAndView getModelAndView(String viewName, Exception ex) {
		// TODO Auto-generated method stub
		return super.getModelAndView(viewName, ex);
	}
	
}
