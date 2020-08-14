package com.example.demo.service.impl;

import com.example.demo.dto.TableRowData;
import com.example.demo.mbg.*;
import com.example.demo.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class TableServiceImpl implements TableService {
    @Autowired
    private TIncomeStatementDao tIncomeStatementDao;
    @Autowired
    private TCashFlowStatementDao tCashFlowStatementDao;
    @Autowired
    private TBalanceSheetDao tBalanceSheetDao;

    @Override
    public Map<String, List<TableRowData>> getRowData(String companyCode) {
        Map<String, List<TableRowData>> data = new HashMap<>();
        data.put("income", getIncomeRowData(companyCode));
        data.put("cashflow", getCashflowRowData(companyCode));
        data.put("balancesheet", getBalancesheetRowData(companyCode));
        return data;
    }

    @Override
    public List<TableRowData> getIncomeRowData(String companyCode) {
        List<TIncomeStatement> incomeData = tIncomeStatementDao.selectByCompanyCode(companyCode);
        List<TableRowData> incomeRowData = new LinkedList<>();

        TableRowData costOfSales = new TableRowData("销售成本");
        TableRowData operatingCosts = new TableRowData("营业成本");
        TableRowData operatingProfits = new TableRowData("营业利润");
        TableRowData operatingIncome = new TableRowData("营业收入");
        TableRowData netprofit = new TableRowData("净利润");

        for (TIncomeStatement data : incomeData) {
            switch (data.getIYear()) {
                case "2019":
                    costOfSales.setData_2019(data.getCostOfSales());
                    operatingCosts.setData_2019(data.getOperatingCosts());
                    operatingProfits.setData_2019(data.getOperatingIncome());
                    operatingIncome.setData_2019(data.getOperatingIncome());
                    netprofit.setData_2019(data.getNetprofit());
                    break;
                case "2018":
                    costOfSales.setData_2018(data.getCostOfSales());
                    operatingCosts.setData_2018(data.getOperatingCosts());
                    operatingProfits.setData_2018(data.getOperatingIncome());
                    operatingIncome.setData_2018(data.getOperatingIncome());
                    netprofit.setData_2018(data.getNetprofit());
                    break;
                case "2017":
                    costOfSales.setData_2017(data.getCostOfSales());
                    operatingCosts.setData_2017(data.getOperatingCosts());
                    operatingProfits.setData_2017(data.getOperatingIncome());
                    operatingIncome.setData_2017(data.getOperatingIncome());
                    netprofit.setData_2017(data.getNetprofit());
                    break;
                case "2016":
                    costOfSales.setData_2016(data.getCostOfSales());
                    operatingCosts.setData_2016(data.getOperatingCosts());
                    operatingProfits.setData_2016(data.getOperatingIncome());
                    operatingIncome.setData_2016(data.getOperatingIncome());
                    netprofit.setData_2016(data.getNetprofit());
                    break;
                case "2015":
                    costOfSales.setData_2015(data.getCostOfSales());
                    operatingCosts.setData_2015(data.getOperatingCosts());
                    operatingProfits.setData_2015(data.getOperatingIncome());
                    operatingIncome.setData_2015(data.getOperatingIncome());
                    netprofit.setData_2015(data.getNetprofit());
                    break;
            }
        }

        incomeRowData.add(costOfSales);
        incomeRowData.add(operatingCosts);
        incomeRowData.add(operatingProfits);
        incomeRowData.add(operatingIncome);
        incomeRowData.add(netprofit);

        return incomeRowData;
    }

    @Override
    public List<TableRowData> getCashflowRowData(String companyCode) {
        List<TCashFlowStatement> cashflowData = tCashFlowStatementDao.selectByCompanyCode(companyCode);
        List<TableRowData> cashflowRowData = new LinkedList<>();

        TableRowData netCashFlowFrowFromOperatingActivities = new TableRowData("经营现金");
        TableRowData netCashFlowsFromInvestingActivities = new TableRowData("投资现金");
        TableRowData netCashFlowsFromFinancingActivities = new TableRowData("筹资现金");

        for (TCashFlowStatement data : cashflowData) {
            switch (data.getCYear()) {
                case "2019":
                    netCashFlowFrowFromOperatingActivities.setData_2019(data.getNetCashFlowFrowFromOperatingActivities());
                    netCashFlowsFromInvestingActivities.setData_2019(data.getNetCashFlowsFromInvestingActivities());
                    netCashFlowsFromFinancingActivities.setData_2019(data.getNetCashFlowsFromFinancingActivities());
                    break;
                case "2018":
                    netCashFlowFrowFromOperatingActivities.setData_2018(data.getNetCashFlowFrowFromOperatingActivities());
                    netCashFlowsFromInvestingActivities.setData_2018(data.getNetCashFlowsFromInvestingActivities());
                    netCashFlowsFromFinancingActivities.setData_2018(data.getNetCashFlowsFromFinancingActivities());
                    break;
                case "2017":
                    netCashFlowFrowFromOperatingActivities.setData_2017(data.getNetCashFlowFrowFromOperatingActivities());
                    netCashFlowsFromInvestingActivities.setData_2017(data.getNetCashFlowsFromInvestingActivities());
                    netCashFlowsFromFinancingActivities.setData_2017(data.getNetCashFlowsFromFinancingActivities());
                    break;
                case "2016":
                    netCashFlowFrowFromOperatingActivities.setData_2016(data.getNetCashFlowFrowFromOperatingActivities());
                    netCashFlowsFromInvestingActivities.setData_2016(data.getNetCashFlowsFromInvestingActivities());
                    netCashFlowsFromFinancingActivities.setData_2016(data.getNetCashFlowsFromFinancingActivities());
                    break;
                case "2015":
                    netCashFlowFrowFromOperatingActivities.setData_2015(data.getNetCashFlowFrowFromOperatingActivities());
                    netCashFlowsFromInvestingActivities.setData_2015(data.getNetCashFlowsFromInvestingActivities());
                    netCashFlowsFromFinancingActivities.setData_2015(data.getNetCashFlowsFromFinancingActivities());
                    break;
            }
        }

        cashflowRowData.add(netCashFlowFrowFromOperatingActivities);
        cashflowRowData.add(netCashFlowsFromInvestingActivities);
        cashflowRowData.add(netCashFlowsFromFinancingActivities);

        return cashflowRowData;
    }

    @Override
    public List<TableRowData> getBalancesheetRowData(String companyCode) {
        List<TBalanceSheet> balanceSheetsData = tBalanceSheetDao.selectByCompanyCode(companyCode);
        List<TableRowData> balanceSheetRowData = new LinkedList<>();

        TableRowData totalLiabilities = new TableRowData("负债合计");
        TableRowData averageInventory = new TableRowData("平均存货");
        TableRowData averageAccountsReceivable = new TableRowData("平均应收账款");
        TableRowData averagePaidInCapital = new TableRowData("平均实收资本");
        TableRowData averageOwnerEquity = new TableRowData("平均所有者权益");
        TableRowData totalCurrentLiabikities = new TableRowData("流动负债合计");
        TableRowData averageCurrentAssets = new TableRowData("平均流动资产");
        TableRowData averageTotalAssets = new TableRowData("平均总资产");

        for (TBalanceSheet data : balanceSheetsData) {
            switch (data.getBYear()) {
                case "2019":
                    totalLiabilities.setData_2019(data.getTotalLiabilities());
                    averageInventory.setData_2019(data.getAverageInventory());
                    averageAccountsReceivable.setData_2019(data.getAverageAccountsReceivable());
                    averagePaidInCapital.setData_2019(data.getAveragePaidInCapital());
                    averageOwnerEquity.setData_2019(data.getAverageOwnerEquity());
                    totalCurrentLiabikities.setData_2019(data.getTotalCurrentLiabikities());
                    averageCurrentAssets.setData_2019(data.getAverageCurrentAssets());
                    averageTotalAssets.setData_2019(data.getAverageTotalAssets());
                    break;
                case "2018":
                    totalLiabilities.setData_2018(data.getTotalLiabilities());
                    averageInventory.setData_2018(data.getAverageInventory());
                    averageAccountsReceivable.setData_2018(data.getAverageAccountsReceivable());
                    averagePaidInCapital.setData_2018(data.getAveragePaidInCapital());
                    averageOwnerEquity.setData_2018(data.getAverageOwnerEquity());
                    totalCurrentLiabikities.setData_2018(data.getTotalCurrentLiabikities());
                    averageCurrentAssets.setData_2018(data.getAverageCurrentAssets());
                    averageTotalAssets.setData_2018(data.getAverageTotalAssets());
                    break;
                case "2017":
                    totalLiabilities.setData_2017(data.getTotalLiabilities());
                    averageInventory.setData_2017(data.getAverageInventory());
                    averageAccountsReceivable.setData_2017(data.getAverageAccountsReceivable());
                    averagePaidInCapital.setData_2017(data.getAveragePaidInCapital());
                    averageOwnerEquity.setData_2017(data.getAverageOwnerEquity());
                    totalCurrentLiabikities.setData_2017(data.getTotalCurrentLiabikities());
                    averageCurrentAssets.setData_2017(data.getAverageCurrentAssets());
                    averageTotalAssets.setData_2017(data.getAverageTotalAssets());
                    break;
                case "2016":
                    totalLiabilities.setData_2016(data.getTotalLiabilities());
                    averageInventory.setData_2016(data.getAverageInventory());
                    averageAccountsReceivable.setData_2016(data.getAverageAccountsReceivable());
                    averagePaidInCapital.setData_2016(data.getAveragePaidInCapital());
                    averageOwnerEquity.setData_2016(data.getAverageOwnerEquity());
                    totalCurrentLiabikities.setData_2016(data.getTotalCurrentLiabikities());
                    averageCurrentAssets.setData_2016(data.getAverageCurrentAssets());
                    averageTotalAssets.setData_2016(data.getAverageTotalAssets());
                    break;
                case "2015":
                    totalLiabilities.setData_2015(data.getTotalLiabilities());
                    averageInventory.setData_2015(data.getAverageInventory());
                    averageAccountsReceivable.setData_2015(data.getAverageAccountsReceivable());
                    averagePaidInCapital.setData_2015(data.getAveragePaidInCapital());
                    averageOwnerEquity.setData_2015(data.getAverageOwnerEquity());
                    totalCurrentLiabikities.setData_2015(data.getTotalCurrentLiabikities());
                    averageCurrentAssets.setData_2015(data.getAverageCurrentAssets());
                    averageTotalAssets.setData_2015(data.getAverageTotalAssets());
                    break;
            }
        }

        balanceSheetRowData.add(totalLiabilities);
        balanceSheetRowData.add(averageInventory);
        balanceSheetRowData.add(averageAccountsReceivable);
        balanceSheetRowData.add(averagePaidInCapital);
        balanceSheetRowData.add(averageOwnerEquity);
        balanceSheetRowData.add(totalCurrentLiabikities);
        balanceSheetRowData.add(averageCurrentAssets);
        balanceSheetRowData.add(averageTotalAssets);

        return balanceSheetRowData;
    }
}
