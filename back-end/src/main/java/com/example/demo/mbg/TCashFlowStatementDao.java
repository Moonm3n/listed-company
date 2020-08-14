package com.example.demo.mbg;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TCashFlowStatementDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TCashFlowStatement record);

    int insertSelective(TCashFlowStatement record);

    TCashFlowStatement selectByPrimaryKey(Integer id);

    List<TCashFlowStatement> selectByCompanyCode(String companyCode);

    int updateByPrimaryKeySelective(TCashFlowStatement record);

    int updateByPrimaryKey(TCashFlowStatement record);
}