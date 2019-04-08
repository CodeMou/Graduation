/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.bean;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.bean
 * @since 2019/3/28
 */
public class ErrorException extends Exception {

	/* 状态 100为成功 200为失败*/
	private String state;

	public ErrorException() {
	}

	public ErrorException(String message, String state) {
		super(message);
		this.state = state;
	}
}
