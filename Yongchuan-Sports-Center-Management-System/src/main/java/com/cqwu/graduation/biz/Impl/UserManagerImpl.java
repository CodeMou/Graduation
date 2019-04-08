/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz.Impl;

import com.cqwu.graduation.bean.AccountType;
import com.cqwu.graduation.bean.Ticket;
import com.cqwu.graduation.bean.User;
import com.cqwu.graduation.biz.UserManager;
import com.cqwu.graduation.mapper.UserMapping;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz.Impl
 * @since 2019/2/12
 */
@Service
@CacheConfig(cacheNames = "users")
public class UserManagerImpl implements UserManager {
	@Autowired
	private UserMapping usermapping;

	/**
	 * 查询到所有普通用户
	 * @param pageNum
	 * @return
	 */
	@Override
	@Cacheable(key = "#root.methodName")
	public PageInfo<User> selectAll(Integer pageNum) {
		PageHelper.startPage(pageNum, 10);
		List<User> users = usermapping.userSelectAll();
		PageInfo<User> pageInfo = new PageInfo<>(users,8);
		return pageInfo;
	}

	/**
	 * 查询到所有管理员账户
	 * @param pageNum 页数
	 * @return
	 */
	@Override
	@Cacheable(key = "#root.methodName")
	public PageInfo<User> selectAllAd(Integer pageNum) {
		PageHelper.startPage(pageNum, 5);
		List<User> users = usermapping.userSelectAllAd();
		PageInfo<User> pageInfo = new PageInfo<User>(users,5);
		return pageInfo;
	}

	/**
	 * 根据用户名,获取用户信息
	 * @param username 用户名
	 * @return
	 */
	@Override
	@Cacheable(condition = "#username != null and !#username.equals('')")
	public User login(String username) {
		User user = usermapping.userSelect(username);
		return user;
	}

	/**
	 * 根据用户名删除用户
	 * @param username 用户名
	 * @return
	 */
	@Override
	@CacheEvict(key = "#username",allEntries = true)
	public Integer deleteUser(String username) {
		Integer integer = usermapping.userDelete(username);
		return integer;
	}

	/**
	 * 注册用户
	 * @param user 用户信息
	 * @return
	 */
	@Override
	@CacheEvict(key = "#user",allEntries = true)
	public Integer register(User user) {
		user.setRawAddTime(new Date());
		Integer integer = usermapping.userAdd(user);
		return integer;
	}

	/**
	 * 更新用户
	 * @param user 用户信息
	 * @return
	 */
	@Override
	@CacheEvict(key = "#username",allEntries = true)
	public Integer updateUser(User user) {
		user.setRawUpdateTime(new Date());
		Integer integer = usermapping.userUpdate(user);
		return integer;
	}

	/**
	 * 管理员添加用户
	 * @param user 用户信息
	 * @return
	 */
	@Override
	@CacheEvict(key = "#user",allEntries = true)
	public Integer addUser(User user) {
		user.setRawAddTime(new Date());
		Integer integer = usermapping.userAddBoss(user);
		return integer;
	}

	/**
	 * 删除文件夹及文件夹下的所有文件
	 * @param file
	 * @return
	 */
	@Override
	public boolean delFile(File file) {
		if (!file.exists()) {
			return false;
		}
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				delFile(f);
			}
		}
		return file.delete();
	}
}
