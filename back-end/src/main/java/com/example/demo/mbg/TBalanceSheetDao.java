package com.example.demo.mbg;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TBalanceSheetDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TBalanceSheet record);

    int insertSelective(TBalanceSheet record);

    TBalanceSheet selectByPrimaryKey(Integer id);

    List<TBalanceSheet> selectByCompanyCode(String companyCode);

    int updateByPrimaryKeySelective(TBalanceSheet record);

    int updateByPrimaryKey(TBalanceSheet record);
}