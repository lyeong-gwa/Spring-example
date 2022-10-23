package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;


//@SuppressWarnings("deprecation")
//public class ConfirmInterceptor extends HandlerInterceptorAdapter {
// spring 5.3 부터는 HandlerInterceptor implements
public class ConfirmInterceptor implements HandlerInterceptor { 

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		
		if(session.getAttribute("city")==null&&session.getAttribute("code")==null) {
			session.setAttribute("city", "pohang");
			session.setAttribute("code", "interceptor");
			response.sendRedirect(request.getContextPath());
			return false;
		}
		return true;
	}
	
}
