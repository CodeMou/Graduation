package com.cqwu.graduation.mapper;

import com.cqwu.graduation.bean.Train;
import com.cqwu.graduation.bean.TrainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainMapper {
    long countByExample(TrainExample example);

    int deleteByExample(TrainExample example);

    int insert(Train record);

    int insertSelective(Train record);

    List<Train> selectByExample(TrainExample example);

    int updateByExampleSelective(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByExample(@Param("record") Train record, @Param("example") TrainExample example);
}