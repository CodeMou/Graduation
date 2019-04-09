/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz.Impl;

import com.cqwu.graduation.bean.Ticket;
import com.cqwu.graduation.biz.TicketManager;
import com.cqwu.graduation.mapper.TicketMapping;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz.Impl
 * @since 2019/2/14
 */
@Service
//@CacheConfig(cacheNames = "ticket")
public class TicketManagerImpl implements TicketManager {

	@Autowired
	private TicketMapping ticketmapping;

	/**
	 * 查询所有演出信息
	 * @param pageNum
	 * @return
	 */
	@Override
//	@Cacheable
	public PageInfo<Ticket> ticketSelectAll(Integer pageNum,String type,String subtype,Integer id) {
		PageHelper.startPage(pageNum, 10);
		List<Ticket> list = ticketmapping.ticketSelectAll(type,subtype,id);
		PageInfo<Ticket> pageInfo = new PageInfo<Ticket>(list,8);
		return pageInfo;
	}

	/**
	 * 按照id删除演出信息
	 * @param id
	 * @return
	 */
	@Override
//	@CacheEvict(key = "#id",allEntries = true)
	public Integer ticketDelete(Integer id) {
		Integer delete = ticketmapping.ticketDelete(id);
		return delete;
	}

	/**
	 * 更新演出信息
	 * @param ticket 演出信息
	 * @return
	 */
	@Override
//	@CacheEvict(key = "#ticket",allEntries = true)
	public Integer ticketUpdate(Ticket ticket) {
		Integer update = ticketmapping.ticketUpdate(ticket);
		return update;
	}

	/**
	 * 更新演出状态
	 * @return
	 */
	@Override
//	@CacheEvict(key = "#id",allEntries = true)
	public Integer ticketUpdateState(String state,Integer id) {
		Integer update = ticketmapping.ticketUpdateState(state,id);
		return update;
	}

	/**
	 * 新增演出信息
	 * @param ticket 演出信息
	 * @return
	 */
	@Override
//	@CacheEvict(key = "#ticket",allEntries = true)
	public Integer ticketAdd(Ticket ticket) {
		Integer add = ticketmapping.ticketAdd(ticket);
		return add;
	}
}
