/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz;

import com.cqwu.graduation.bean.Enroll;
import com.cqwu.graduation.bean.EnrollExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz
 * @since 2019/4/2
 */
public interface EnrollerManager {

	//取消预约场地
	int deleteByField(EnrollExample example);
	//取消比赛报名
	int deleteByMatch(EnrollExample example);
	//取消报名培训
	int deleteByTrain(EnrollExample example);
	//预约场地
	int insertOfFeild(Enroll record);
	//报名比赛
	int insertOfmatch(Enroll record);
	//报名培训
	int insertOftrain(Enroll record);
	//根据用户名，找到用户名对应某次的比赛场次
	long countMatchByUsername(Integer matchId,String username);
	//查询比赛是否重复报名
	long countMatchRepeat(Integer matchId, String username);
	//根据用户名，找到用户名对应的培训场次
	long countTrainByUsername(Integer trainId,String username);
	//根据用户名，找到用户名对应的所有信息
	List<Enroll> selectByUsername(String username);
}
