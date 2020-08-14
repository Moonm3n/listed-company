package com.example.demo.mbg;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TCompanyDao {

    List<Map> selectAll();

    List<String> selectAllCname();

    int deleteByPrimaryKey(String cId);

    int insert(TCompany record);

    int insertSelective(TCompany record);

    TCompany selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(TCompany record);

    int updateByPrimaryKey(TCompany record);
}