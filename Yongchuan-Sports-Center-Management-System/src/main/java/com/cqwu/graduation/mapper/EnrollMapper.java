package com.cqwu.graduation.mapper;

import com.cqwu.graduation.bean.Enroll;
import com.cqwu.graduation.bean.EnrollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollMapper {
    long countByExample(EnrollExample example);

    int deleteByExample(EnrollExample example);

    int insert(Enroll record);

    int insertSelective(Enroll record);

    List<Enroll> selectByExample(EnrollExample example);

    int updateByExampleSelective(@Param("record") Enroll record, @Param("example") EnrollExample example);

    int updateByExample(@Param("record") Enroll record, @Param("example") EnrollExample example);
}