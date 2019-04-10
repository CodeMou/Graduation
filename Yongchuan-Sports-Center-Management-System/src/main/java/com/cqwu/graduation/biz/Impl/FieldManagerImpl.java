/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz.Impl;

import com.cqwu.graduation.bean.Field;
import com.cqwu.graduation.bean.FieldExample;
import com.cqwu.graduation.biz.FieldManager;
import com.cqwu.graduation.mapper.FieldMapper;
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
//@CacheConfig(cacheNames = "field")
public class FieldManagerImpl implements FieldManager {

	@Autowired
	private FieldMapper fieldMapper;

	@Override
	public long countByExample(FieldExample example) {
		return 0;
	}

	@Override
	@CacheEvict(key = "#id",allEntries = true)
	public int deleteByExample(Integer id) {
		FieldExample example = new FieldExample();
		FieldExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		int i = fieldMapper.deleteByExample(example);
		return i;
	}

	@Override
	@CacheEvict(key = "#record",allEntries = true)
	public int insert(Field record) {
		int insert = fieldMapper.insert(record);
		return insert;
	}

	@Override
	public int insertSelective(Field record) {
		return 0;
	}

	@Override
//	@Cacheable
	public PageInfo<Field> selectByExample(Integer id) {
		FieldExample example = new FieldExample();
		FieldExample.Criteria criteria = example.createCriteria();
		if (id != null){
			criteria.andIdEqualTo(id);
		}
		PageHelper.startPage(1,20);
		List<Field> matches = fieldMapper.selectByExample(example);
		PageInfo<Field> pageInfo = new PageInfo<>(matches,8);
		return pageInfo;
	}

	@Override
//	@Cacheable
	public List<Field> selectByName(String name) {
		FieldExample example = new FieldExample();
		FieldExample.Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		List<Field> matches = fieldMapper.selectByExample(example);
		return matches;
	}

	@Override
//	@CacheEvict(key = "#record",allEntries = true)
	public int updateByExampleSelective(Field record) {
		FieldExample example = new FieldExample();
		FieldExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(record.getId());
		int i = fieldMapper.updateByExampleSelective(record, example);
		return i;
	}

	@Override
	public int updateByExample(Field record, FieldExample example) {
		return 0;
	}
}
