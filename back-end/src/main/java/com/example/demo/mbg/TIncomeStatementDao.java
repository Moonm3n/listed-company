package com.example.demo.mbg;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TIncomeStatementDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TIncomeStatement record);

    int insertSelective(TIncomeStatement record);

    TIncomeStatement selectByPrimaryKey(Integer id);

    List<TIncomeStatement> selectByCompanyCode(String companyCode);


    int updateByPrimaryKeySelective(TIncomeStatement record);

    int updateByPrimaryKey(TIncomeStatement record);


}