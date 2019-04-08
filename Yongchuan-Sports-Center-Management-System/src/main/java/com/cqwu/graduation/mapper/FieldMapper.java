package com.cqwu.graduation.mapper;

import com.cqwu.graduation.bean.Field;
import com.cqwu.graduation.bean.FieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldMapper {
    long countByExample(FieldExample example);

    int deleteByExample(FieldExample example);

    int insert(Field record);

    int insertSelective(Field record);

    List<Field> selectByExample(FieldExample example);

    int updateByExampleSelective(@Param("record") Field record, @Param("example") FieldExample example);

    int updateByExample(@Param("record") Field record, @Param("example") FieldExample example);
}