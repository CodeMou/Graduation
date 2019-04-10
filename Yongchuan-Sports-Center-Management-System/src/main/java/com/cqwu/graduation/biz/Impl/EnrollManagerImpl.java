/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz.Impl;

import com.cqwu.graduation.bean.Enroll;
import com.cqwu.graduation.bean.EnrollExample;
import com.cqwu.graduation.biz.EnrollerManager;
import com.cqwu.graduation.mapper.EnrollMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz.Impl
 * @since 2019/4/2
 */
@Service
public class EnrollManagerImpl implements EnrollerManager {

	@Autowired
	private EnrollMapper enrollMapper;

	@Override public int deleteByField(EnrollExample example) {
		return 0;
	}

	@Override public int deleteByMatch(EnrollExample example) {
		return 0;
	}

	@Override public int deleteByTrain(EnrollExample example) {
		return 0;
	}

	@Override public int insertOfFeild(Enroll record) {
		int insert = enrollMapper.insert(record);
		return insert;
	}

	@Override public int insertOfmatch(Enroll record) {
		int insert = enrollMapper.insert(record);
		return insert;
	}

	@Override public int insertOftrain(Enroll record) {
		int insert = enrollMapper.insert(record);
		return insert;
	}

	@Override public long countMatchByUsername(Integer matchId, String username) {
		EnrollExample enrollExample = new EnrollExample();
		EnrollExample.Criteria criteria = enrollExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andEntryMatchIdIsNotNull();
		criteria.andMatchStateEqualTo("Enrolling");
		long l = enrollMapper.countByExample(enrollExample);
		return l;
	}

	@Override public long countMatchRepeat(Integer matchId, String username) {
		EnrollExample enrollExample = new EnrollExample();
		EnrollExample.Criteria criteria = enrollExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andEntryMatchIdEqualTo(matchId);
		criteria.andMatchStateEqualTo("Enrolling");
		long l = enrollMapper.countByExample(enrollExample);
		return l;
	}

	@Override public long countTrainByUsername(Integer trainId, String username) {
		EnrollExample enrollExample = new EnrollExample();
		EnrollExample.Criteria criteria = enrollExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andEntrySubjectIdIsNotNull();
		criteria.andSubjectStateEqualTo("Enrolling");
		long l = enrollMapper.countByExample(enrollExample);
		return l;
	}

	@Override public List<Enroll> selectByUsername(String username) {
		EnrollExample enrollExample = new EnrollExample();
		EnrollExample.Criteria criteria = enrollExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Enroll> enrolls = enrollMapper.selectByExample(enrollExample);
		return enrolls;
	}

}
