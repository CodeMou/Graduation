/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.filter
 * @since 2019/2/12
 */
@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Object username = request.getSession().getAttribute("username");
		if (username == null){
			request.setAttribute("error","没有权限，请先登录");
			request.getRequestDispatcher("/").forward(request,response);
			return false;
		}else {
			return true;
		}
	}
}
