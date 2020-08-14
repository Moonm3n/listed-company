package com.example.demo.service;

import com.example.demo.dto.TableRowData;

import java.util.List;
import java.util.Map;

public interface TableService {

    Map<String, List<TableRowData>> getRowData(String companyCode);

    List<TableRowData> getIncomeRowData(String companyCode);

    List<TableRowData> getCashflowRowData(String companyCode);

    List<TableRowData> getBalancesheetRowData(String companyCode);


}
