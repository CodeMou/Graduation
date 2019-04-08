package com.cqwu.graduation.mapper;

import com.cqwu.graduation.bean.Transaction;
import com.cqwu.graduation.bean.TransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionMapper {
    long countByExample(TransactionExample example);

    int deleteByExample(TransactionExample example);

    int insert(Transaction record);

    int insertSelective(Transaction record);

    List<Transaction> selectByExample(TransactionExample example);

    int updateByExampleSelective(@Param("record") Transaction record, @Param("example") TransactionExample example);

    int updateByExample(@Param("record") Transaction record, @Param("example") TransactionExample example);
}