/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.controller;

import com.cqwu.graduation.bean.Enroll;
import com.cqwu.graduation.bean.Field;
import com.cqwu.graduation.biz.EnrollerManager;
import com.cqwu.graduation.biz.FieldManager;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.controller
 * @since 2019/2/13
 */
@Controller
public class IndexController {
	@Autowired
	private EnrollerManager enrollerManager;

	@Autowired
	private FieldManager fieldManager;

	/**
	 * 获取所有场馆的信息（场地）
	 *
	 * @return
	 */
	@RequestMapping(value = "/fieldPage", produces = "text/html;charset=UTF-8")
	public String select2(Model model) {
		return null;
	}

	/**
	 * 预约场地
	 * @param enroll 预约场地所用到的参数
	 * @return
	 */
	@ResponseBody
	@PostMapping("/BookingSpace")
	public String BookingSpace(Enroll enroll){

		return null;

	}

	/**
	 * 主页面跳转
	 * @param page
	 * @param model
	 * @return
	 */
	@RequestMapping("/navigation")
	public String navigation(@RequestParam("page")String page, Model model){
		model.addAttribute("whatPage",page);
		return "navigation";
	}
}
