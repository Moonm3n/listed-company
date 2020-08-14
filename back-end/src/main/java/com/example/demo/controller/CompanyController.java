package com.example.demo.controller;

import com.example.demo.common.api.CommonResult;
import com.example.demo.mbg.TCompany;
import com.example.demo.service.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyServiceImpl companyServiceImpl;

    @GetMapping("")
    public List<String> listCname(){
        return companyServiceImpl.listCname();
    }

    @GetMapping("/{c_id}")
    public CommonResult<TCompany> getCompany(@PathVariable("c_id") String c_id){
        return CommonResult.success(companyServiceImpl.getCompany(c_id));
    }
}
