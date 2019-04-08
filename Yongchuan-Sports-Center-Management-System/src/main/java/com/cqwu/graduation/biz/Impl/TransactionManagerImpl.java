/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz.Impl;

import com.cqwu.graduation.bean.Enroll;
import com.cqwu.graduation.bean.Transaction;
import com.cqwu.graduation.bean.TransactionExample;
import com.cqwu.graduation.biz.TransactionManager;
import com.cqwu.graduation.mapper.TransactionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz.Impl
 * @since 2019/3/29
 */
@Service
public class TransactionManagerImpl implements TransactionManager {

	@Autowired
	private TransactionMapper transactionMapper;

	@Override public Integer insert(Transaction transaction) {
		int insert = transactionMapper.insert(transaction);
		return insert;
	}

	@Override public List<Transaction> selectByExample(String payer) {
		TransactionExample transactionExample = new TransactionExample();
		TransactionExample.Criteria criteria = transactionExample.createCriteria();
		criteria.andPayerEqualTo(payer);
		criteria.andStateEqualTo("paid");
		List<Transaction> transactions = transactionMapper.selectByExample(transactionExample);
		return transactions;
	}

	@Override public Integer countTicket(String username, Integer ticketId) {
		TransactionExample transactionExample = new TransactionExample();
		TransactionExample.Criteria criteria = transactionExample.createCriteria();
		criteria.andCommodityIdEqualTo(ticketId);
		criteria.andPayerEqualTo(username);
		Transaction transaction = transactionMapper.selectByExample(transactionExample).get(0);
		if (transaction == null){
			return 0;
		}else {
			return transaction.getNumber();
		}
	}

	@Override public Integer updateTicket(String username, Integer ticketId, Integer number) {
		TransactionExample transactionExample = new TransactionExample();
		TransactionExample.Criteria criteria = transactionExample.createCriteria();
		criteria.andCommodityIdEqualTo(ticketId);
		criteria.andPayerEqualTo(username);
		//需要改变的对象，将买票的数量进行修改
		Transaction transaction = new Transaction();
		transaction.setNumber(number);
		transactionMapper.updateByExampleSelective(transaction,transactionExample);
		return null;
	}
/*	@Override public List<Transaction> selectByTypeAndSubtype(String payer) {
		TransactionExample transactionExample = new TransactionExample();
		TransactionExample.Criteria criteria = transactionExample.createCriteria();
		criteria.andPayerEqualTo(payer);
		criteria.andStateEqualTo("paid");
		List<Transaction> transactions = transactionMapper.selectByExample(transactionExample);
		return null;
	}*/

}
