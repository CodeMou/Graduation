/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.mapper;

import com.cqwu.graduation.bean.Ticket;
import com.cqwu.graduation.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TicketMapping {

	List<Ticket> ticketSelectAll(@Param("type")String type,@Param("subtype")String subtype,@Param("id")Integer id);

	Integer ticketAdd(Ticket ticket);

	Integer ticketUpdate(Ticket ticket);

	Integer ticketUpdateState(@Param("state") String state,@Param("id") Integer id);

	Integer ticketDelete(Integer id);
}
