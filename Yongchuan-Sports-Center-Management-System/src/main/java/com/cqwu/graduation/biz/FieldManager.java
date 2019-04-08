/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.biz;

import com.cqwu.graduation.bean.Field;
import com.cqwu.graduation.bean.FieldExample;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.biz
 * @since 2019/3/5
 */
public interface FieldManager {

	long countByExample(FieldExample example);

	int deleteByExample(Integer id);

	int insert(Field record);

	int insertSelective(Field record);

	PageInfo<Field> selectByExample(Integer id);

	int updateByExampleSelective(Field record);

	int updateByExample(@Param("record") Field record, @Param("example") FieldExample example);

	List<Field> selectByName(String name);
}
