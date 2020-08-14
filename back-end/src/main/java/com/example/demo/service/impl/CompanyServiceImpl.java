package com.example.demo.service.impl;

import com.example.demo.mbg.TCompany;
import com.example.demo.mbg.TCompanyDao;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private TCompanyDao tCompanyDao;

    @Override
    public List<String> listCname() {
        return tCompanyDao.selectAllCname();
    }

    @Override
    public TCompany getCompany(String c_id) {
        return tCompanyDao.selectByPrimaryKey(c_id);
    }
}
