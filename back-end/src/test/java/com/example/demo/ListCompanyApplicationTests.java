package com.example.demo;

import com.example.demo.mbg.TCompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ListCompanyApplicationTests {
    @Autowired
    TCompanyDao tCompanyDao;

    @Test
    public void test(){
        System.out.println(tCompanyDao.selectAllCname());
    }

}
