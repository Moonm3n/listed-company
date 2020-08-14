package com.example.demo.controller;

import com.example.demo.dto.TableRowData;
import com.example.demo.mbg.TCompanyDao;
import com.example.demo.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class TestController {
    @Autowired
    private TCompanyDao tCompanyDao;

    @Autowired
    private TableService tableService;

    @GetMapping("")
    public Map<String, List<TableRowData>> getAllCompany(){
        System.out.println("ssss");
        return tableService.getRowData("000001");
    }



}
