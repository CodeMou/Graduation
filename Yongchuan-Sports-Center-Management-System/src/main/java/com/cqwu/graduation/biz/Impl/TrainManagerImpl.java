/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz.Impl;


import com.cqwu.graduation.bean.Train;
import com.cqwu.graduation.bean.TrainExample;
import com.cqwu.graduation.biz.TrainManager;
import com.cqwu.graduation.mapper.TrainMapper;
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
 * @since 2019/3/5
 */
@Service
//@CacheConfig(cacheNames = "train")
public class TrainManagerImpl implements TrainManager {

	@Autowired
	private TrainMapper trainMapper;

	@Override public long countByExample(TrainExample example) {
		return 0;
	}

	@Override
//	@CacheEvict(key = "#id",allEntries = true)
	public int deleteById(Integer id) {
		TrainExample example = new TrainExample();
		TrainExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		int i = trainMapper.deleteByExample(example);
		return i;
	}

	@Override public int insert(Train record) {
		int insert = trainMapper.insert(record);
		return insert;
	}

	@Override public int insertSelective(Train record) {
		return 0;
	}

	@Override
//	@Cacheable
	public Train selectById(Integer id,Integer pageNum) {
		TrainExample example = new TrainExample();
		TrainExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		PageHelper.startPage(pageNum, 10);
		List<Train> trains = trainMapper.selectByExample(example);
		Train train = trains.get(0);
		return train;
	}

	@Override
//	@Cacheable
	public PageInfo<Train> selectBySubject(String subject, Integer pageNum) {
		TrainExample example = new TrainExample();
		TrainExample.Criteria criteria = example.createCriteria();
		criteria.andSubjectEqualTo(subject);
		PageHelper.startPage(pageNum, 10);
		List<Train> trains = trainMapper.selectByExample(example);
		PageInfo<Train> pageInfo = new PageInfo<Train>(trains,8);
		return pageInfo;
	}

	@Override
//	@CacheEvict(key = "#train",allEntries = true)
	public int updateByExampleSelective(Train train) {
		TrainExample example = new TrainExample();
		TrainExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(train.getId());
		int i = trainMapper.updateByExampleSelective(train, example);
		return i;
	}

	@Override public int updateByExample(Train record, TrainExample example) {
		return 0;
	}
}
