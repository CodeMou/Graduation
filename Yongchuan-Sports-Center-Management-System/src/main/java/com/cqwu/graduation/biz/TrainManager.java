/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz;

import com.cqwu.graduation.bean.Train;
import com.cqwu.graduation.bean.TrainExample;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz
 * @since 2019/3/5
 */
public interface TrainManager {
	long countByExample(TrainExample example);

	int deleteById(Integer id);

	int insert(Train record);

	int insertSelective(Train record);

	Train selectById(Integer id, Integer pageNum);

	PageInfo<Train> selectBySubject(String subject, Integer pageNum);

	int updateByExampleSelective(Train train);

	int updateByExample(@Param("record") Train record, @Param("example") TrainExample example);
}
