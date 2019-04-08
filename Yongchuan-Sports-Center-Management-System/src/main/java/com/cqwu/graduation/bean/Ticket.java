/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Administrator (Administrator@yiji.com)
 *
 * @version 1.0
 *
 * @filename com.cqwu.graduation.bean
 *
 * @since 2019/2/14
 */
public class Ticket {

	/* 主键 自增*/
	private Integer id;
	/* 标题 */
	private String title;
	/* 简介 */
	private String explain;
	/* 海报地址 */
	private String poster;
	/* 地址 */
	private String address;
	/* 类别 */
	private String type;
	/* 子类 */
	private String subtype;
    /* 详细地址 */
	private String detailedAddress;
	/* 演出或者比赛开始时间 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date showTimeStart;
	/* 演出或者比赛结束时间 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date showTimeEnd;
	/* 星期几 */
	private String week;
	/* 票价 */
	private String price;
	/* 状态 */
	private String state;
	/* 剩余票数*/
	private Integer numberSurplus;
	/* 总票数 */
	private Integer number;
	/* A区价格 */
	private Long aArea;
	/* B区价格 */
	private Long bArea;
	/* C区价格 */
	private Long cArea;
	/* D区价格 */
	private Long dArea;
	/* E区价格 */
	private Long eArea;
	/* F区价格 */
	private Long fArea;
	/* 新增时间 */
	private Date rawAddTime;
	/* 修改时间 */
	private Date rawUpdateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public Date getShowTimeStart() {
		return showTimeStart;
	}

	public void setShowTimeStart(Date showTimeStart) {
		this.showTimeStart = showTimeStart;
	}

	public Date getShowTimeEnd() {
		return showTimeEnd;
	}

	public void setShowTimeEnd(Date showTimeEnd) {
		this.showTimeEnd = showTimeEnd;
	}

	public Integer getNumberSurplus() {
		return numberSurplus;
	}

	public void setNumberSurplus(Integer numberSurplus) {
		this.numberSurplus = numberSurplus;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getRawAddTime() {
		return rawAddTime;
	}

	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}

	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public Long getaArea() {
		return aArea;
	}

	public void setaArea(Long aArea) {
		this.aArea = aArea;
	}

	public Long getbArea() {
		return bArea;
	}

	public void setbArea(Long bArea) {
		this.bArea = bArea;
	}

	public Long getcArea() {
		return cArea;
	}

	public void setcArea(Long cArea) {
		this.cArea = cArea;
	}

	public Long getdArea() {
		return dArea;
	}

	public void setdArea(Long dArea) {
		this.dArea = dArea;
	}

	public Long geteArea() {
		return eArea;
	}

	public void seteArea(Long eArea) {
		this.eArea = eArea;
	}

	public Long getfArea() {
		return fArea;
	}

	public void setfArea(Long fArea) {
		this.fArea = fArea;
	}
}
