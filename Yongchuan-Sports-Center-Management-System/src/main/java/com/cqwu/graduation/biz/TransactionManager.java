/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz;

import com.cqwu.graduation.bean.Enroll;
import com.cqwu.graduation.bean.Transaction;
import com.cqwu.graduation.bean.TransactionExample;

import java.util.List;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz
 * @since 2019/3/29
 */
public interface TransactionManager {
	Integer insert(Transaction transaction);

	List<Transaction> selectByExample(String payer);

	Integer countTicket(String username ,Integer ticketId);

	Integer updateTicket(String username,Integer ticketId,Integer number);

	/*List<Transaction> selectByTypeAndSubtype(String payer,String type,String subType);*/
}
