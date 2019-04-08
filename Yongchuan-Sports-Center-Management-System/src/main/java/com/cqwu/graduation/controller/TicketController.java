/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.controller;

import com.cqwu.graduation.bean.Ticket;
import com.cqwu.graduation.bean.Transaction;
import com.cqwu.graduation.biz.TicketManager;
import com.cqwu.graduation.biz.TransactionManager;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.controller
 * @since 2019/2/14
 */
@Controller
public class TicketController {

	@Autowired
	private TicketManager ticketManager;
	@Autowired
	private TransactionManager transactionManager;
	/**
	 * 获取所有票的信息（购票）
	 *
	 * @param PageNum
	 * @param model
	 * @return
	 */
	@GetMapping(value = "/ticketPurchase", produces = "text/html;charset=UTF-8")
	public String select(@RequestParam(value = "PageNum", defaultValue = "1") Integer PageNum,
						 Model model,@RequestParam(value = "type")String type,@RequestParam(value = "subtype")String subtype) {
		PageInfo<Ticket> p = ticketManager.ticketSelectAll(PageNum,type,subtype,null);
		model.addAttribute("page", p);
		model.addAttribute("type", type);
		model.addAttribute("subtype", subtype);
		model.addAttribute("Tickets", p.getList());
		return "ticketPurchase";
	}

	/**
	 * 购票
	 * @param transaction 购票信息
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/ticketPurchase")
	public String buy(@RequestParam(value = "transaction")Transaction transaction){
		Integer integer = transactionManager.countTicket(transaction.getPayer(), transaction.getCommodityId());
		if (integer == 0){
			Integer insert = transactionManager.insert(transaction);
			if (insert > 0){
				return "购票成功！";
			}else {
				return "购票失败";
			}
		}else {
			Integer integer1 = transactionManager.updateTicket(transaction.getPayer(), transaction.getCommodityId(),
					integer + transaction.getNumber());
			if (integer1 > 0){
				return "购票成功！";
			}else {
				return "购票失败！";
			}
		}
	}

	/**
	 * 个人信息界面获取已购票的信息
	 * @param payer
	 * @param modelMap
	 * @return
	 */
	@GetMapping(value = "/transaction")
	public String selectMyTicket(@RequestParam(value = "payer")String payer, ModelMap modelMap){
		List<Transaction> transactions = transactionManager.selectByExample(payer);
		modelMap.put("transactions",transactions);
		return "";
	}

	/**
	 * 获取该用户所购买的票的id返回前台
	 * @param payer
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "/transaction/{id}")
	public List<Integer> checkMyTicket(@RequestParam(value = "payer")String payer){
		List<Transaction> transactions = transactionManager.selectByExample(payer);
		List<Integer> ids = new ArrayList<>();
		for (Transaction transaction : transactions) {
			ids.add(transaction.getId());
		}
		return ids;
	}
}
