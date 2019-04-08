/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz;

import com.cqwu.graduation.bean.AccountType;
import com.cqwu.graduation.bean.User;
import com.github.pagehelper.PageInfo;

import java.io.File;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz
 * @since 2019/2/12
 */
public interface UserManager {

	PageInfo<User> selectAll(Integer pageNum);

	PageInfo<User> selectAllAd(Integer pageNum);

	User login(String username);

	Integer deleteUser(String username);

	Integer register(User user);

	Integer updateUser(User user);

	Integer addUser(User user);

	boolean delFile(File file);
}
