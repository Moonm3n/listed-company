package com.example.demo.controller;

import com.example.demo.common.api.CommonResult;
import com.example.demo.dto.TableRowData;
import com.example.demo.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TableController {

    @Autowired
    TableService tableService;

    @GetMapping("/table/{companyCode}")
    public CommonResult<Map<String, List<TableRowData>>> getTableData(@PathVariable("companyCode") String companyConde){
        return CommonResult.success(tableService.getRowData(companyConde));
    }
}
