/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz;

import com.cqwu.graduation.bean.Match;
import com.cqwu.graduation.bean.MatchExample;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz
 * @since 2019/3/5
 */
public interface MatchManager {
	long countByExample(MatchExample example);

	int deleteByExample(Integer id);

	int insert(Match record);

	int insertSelective(Match record);

	PageInfo<Match> selectByExample(Integer id, String subject, String category, Integer pageNum);

	int updateByExampleSelective(Match match);

	int updateByExample(@Param("record") Match record, @Param("example") MatchExample example);
}
