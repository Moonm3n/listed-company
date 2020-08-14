package com.example.demo.service;

import com.example.demo.mbg.TCompany;

import java.util.List;

public interface CompanyService {

    List<String> listCname();

    TCompany getCompany(String c_id);

}
