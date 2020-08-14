package com.example.demo.mbg;

import org.springframework.stereotype.Repository;

@Repository
public interface TUsrDao {
    int deleteByPrimaryKey(Integer usrId);

    int insert(TUsr record);

    int insertSelective(TUsr record);

    TUsr selectByPrimaryKey(Integer usrId);

    TUsr selectByUsername(String username);

    int updateByPrimaryKeySelective(TUsr record);

    int updateByPrimaryKey(TUsr record);
}