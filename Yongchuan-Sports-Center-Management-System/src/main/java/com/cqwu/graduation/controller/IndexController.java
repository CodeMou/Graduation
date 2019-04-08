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
		PageInfo<Field> fieldPageInfo = fieldManager.selectByExample(null);
		model.addAttribute("page",fieldPageInfo);
		model.addAttribute("fields",fieldPageInfo.getList());
		return "index";
	}

	/**
	 * 预约场地
	 * @param enroll 预约场地所用到的参数
	 * @return
	 */
	@ResponseBody
	@PostMapping("/BookingSpace")
	public String BookingSpace(Enroll enroll){
		long l = enrollerManager.countFieldByUsername(enroll.getEntryFieldName(), enroll.getUsername());
		long l1 = enrollerManager.countFieldByBoss(enroll.getAppointStartTime(), enroll.getAppointEndTime());
		Field field = fieldManager.selectByName(enroll.getEntryFieldName()).get(0);
		Integer number = field.getNumber();
		if (l > 3 ){
			return "对不起，当前您所预定的场地数大于3场，无法预约！";
		}else if (l1 >= number){
			//根据预约时间判断人数
			return "对不起，预约期间人数已满";
		}else{
			int i = enrollerManager.insertOfFeild(enroll);
			if (i > 0){
				return "预约成功！";
			}
		}
		return null;
	}

	public String navegation(){

		return "navigation";
	}
}
