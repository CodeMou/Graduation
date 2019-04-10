/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.controller;

import com.cqwu.graduation.bean.Enroll;
import com.cqwu.graduation.bean.Match;
import com.cqwu.graduation.biz.EnrollerManager;
import com.cqwu.graduation.biz.MatchManager;
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
public class MatchController {

	@Autowired
	private EnrollerManager enrollerManager;

	@Autowired
	private MatchManager matchManager;

	/**
	 * 获取所有比赛的信息
	 *
	 * @return
	 */
	@RequestMapping(value = "/matchPage", produces = "text/html;charset=UTF-8")
	public String select1(@RequestParam(value = "PageNum", defaultValue = "1") Integer pageNum, @RequestParam("subject")String subject, @RequestParam("category")String category,Model model) {
		PageInfo<Match> matchPageInfo = matchManager.selectByExample(null, subject, category, pageNum);
		model.addAttribute("matches",matchPageInfo.getList());
		model.addAttribute("page",matchPageInfo);
		model.addAttribute("category",category);
		model.addAttribute("subject",subject);
		return "Match";
	}
	/**
	 * 报名比赛
	 * @param enroll 报名比赛的参数
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/EnrollMatch")
	public String EnrollMatch(Enroll enroll){
		long l = enrollerManager.countMatchByUsername(enroll.getEntryMatchId(), enroll.getUsername());
		if (l > 2){
			return "对不起，您已报名三场比赛，请参加完比赛以后再次报名，谢谢";
		}else {
			long l1 = enrollerManager.countMatchRepeat(enroll.getEntryMatchId(), enroll.getUsername());
			if (l1 > 0){
				return "对不起，您已报该比赛，请勿重复报名!";
			}else {
				int i = enrollerManager.insertOfmatch(enroll);
				if (i > 0){
					return "报名成功";
				}else {
					return "报名失败";
				}
			}
		}

	}
}
