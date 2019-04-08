/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz;

import com.cqwu.graduation.bean.Ticket;
import com.github.pagehelper.PageInfo;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz
 * @since 2019/2/14
 */
public interface TicketManager {

	PageInfo<Ticket> ticketSelectAll(Integer pageNum,String type,String subtype,Integer id);

	Integer ticketDelete(Integer id);

	Integer ticketUpdate(Ticket ticket);

	Integer ticketAdd(Ticket ticket);

	Integer ticketUpdateState(String state,Integer id);
}
