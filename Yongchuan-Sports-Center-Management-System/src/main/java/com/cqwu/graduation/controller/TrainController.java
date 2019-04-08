/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.controller;

import com.cqwu.graduation.bean.Enroll;
import com.cqwu.graduation.bean.Train;
import com.cqwu.graduation.biz.EnrollerManager;
import com.cqwu.graduation.biz.TrainManager;
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
 * @since 2019/3/29
 */
@Controller
public class TrainController {

	@Autowired
	private EnrollerManager enrollerManager;

	@Autowired
	private TrainManager trainManager;
	/**
	 * 获取所有培训的信息（培训）
	 *
	 * @param PageNum
	 * @return
	 */
	@RequestMapping(value = "/trainPage", produces = "text/html;charset=UTF-8")
	public String select(@RequestParam(value = "PageNum", defaultValue = "1") Integer PageNum, @RequestParam("subject")String subject, Model model) {
		PageInfo<Train> trainPageInfo = trainManager.selectBySubject(subject, PageNum);
		model.addAttribute("page", trainPageInfo);
		model.addAttribute("subject", subject);
		model.addAttribute("trains",trainPageInfo.getList());
		return "/Train";
	}

	/**
	 * 报名培训
	 * @param enroll
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/EnrollTrain")
	public String EnrollTrain(Enroll enroll){
		long l = enrollerManager.countTrainByUsername(enroll.getEntrySubjectId(), enroll.getUsername());
		if (l > 1){
			return "对不起，您已报名培训，请勿重复报名";
		}else {
			int i = enrollerManager.insertOftrain(enroll);
			if (i > 0){
				return "报名成功";
			}else {
				return "报名失败";
			}
		}
	}
}
