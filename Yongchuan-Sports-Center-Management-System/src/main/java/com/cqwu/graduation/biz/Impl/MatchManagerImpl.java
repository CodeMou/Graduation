/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz.Impl;

import com.cqwu.graduation.bean.Match;
import com.cqwu.graduation.bean.MatchExample;
import com.cqwu.graduation.biz.MatchManager;
import com.cqwu.graduation.mapper.MatchMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz.Impl
 * @since 2019/3/5
 */
@Service
@CacheConfig(cacheNames = "match")
public class MatchManagerImpl implements MatchManager {

	@Autowired
	private MatchMapper matchMapper;

	@Override public long countByExample(MatchExample example) {
		return 0;
	}

	@Override
	@CacheEvict(key = "#id",allEntries = true)
	public int deleteByExample(Integer id) {
		MatchExample example = new MatchExample();
		MatchExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		int i = matchMapper.deleteByExample(example);
		return i;
	}

	@Override
	@Cacheable
	public PageInfo<Match> selectByExample(Integer id, String subject, String category, Integer pageNum) {
		MatchExample example = new MatchExample();
		MatchExample.Criteria criteria = example.createCriteria();
		if (id != null){
			criteria.andIdEqualTo(id);
		}
		if (subject != null && !subject.equals("")){
			criteria.andSubjectEqualTo(subject);
		}
		if (category != null && !category.equals("")){
			criteria.andCategoryEqualTo(category);
		}
		PageHelper.startPage(pageNum,10);
		List<Match> matches = matchMapper.selectByExample(example);
		PageInfo<Match> pageInfo = new PageInfo<Match>(matches,8);
		return pageInfo;
	}

	@Override
	@CacheEvict(key = "#record",allEntries = true)
	public int insert(Match record) {
		int insert = matchMapper.insert(record);
		return insert;
	}

	@Override
	@CacheEvict(key = "#record",allEntries = true)
	public int insertSelective(Match record) {
		return 0;
	}


	@Override
	@CacheEvict(key = "#match",allEntries = true)
	public int updateByExampleSelective(Match match) {
		MatchExample example = new MatchExample();
		MatchExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(match.getId());
		int i = matchMapper.updateByExampleSelective(match,example);
		return i;
	}

	@Override public int updateByExample(Match record, MatchExample example) {
		return 0;
	}
}
