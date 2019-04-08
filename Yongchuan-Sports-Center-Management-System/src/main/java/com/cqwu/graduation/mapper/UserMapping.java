/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.mapper;

import com.cqwu.graduation.bean.AccountType;
import com.cqwu.graduation.bean.User;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserMapping {

	List<User> userSelectAll();

	List<User> userSelectAllAd();

	User userSelect(String username);

	Integer userAdd(User user);

	Integer userUpdate(User user);

	Integer userDelete(String username);

	Integer userAddBoss(User user);
}
