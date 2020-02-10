package com.mvc.upgrade.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	// controller 실행 요청 전에 수행 / true -> controller O, false -> controller X (Dispatcher로 넘어감) 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		logger.info("[interceptor] : preHandle");

		if (request.getRequestURI().contains("/loginform.do") || 
				request.getRequestURI().contains("/ajaxlogin.do") ||
				request.getRequestURI().contains("/test.do")) {
			
			return true;
		}
		if (request.getSession().getAttribute("login") == null) {
			
			response.sendRedirect("loginform.do");
			return false;
		}
		if(request.getSession().getAttribute("login") != null) {
			
			return true;
		}

		return false;
	}

	// view로 forward 되기 전에 수행
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		logger.info("[interceptor] : postHandle");

	}
	
	//view까지 처리 끝난 후 처리 
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		logger.info("[interceptor] : afterCompletion");
		
	}

}
