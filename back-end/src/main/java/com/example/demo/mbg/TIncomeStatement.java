package com.example.demo.mbg;

import lombok.Data;

import java.io.Serializable;

/**
 * t_income_statement
 * @author 
 */
@Data
public class TIncomeStatement implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 年份
     */
    private String iYear;

    /**
     * 销售成本
     */
    private Long costOfSales;


    /**
     * 营业成本
     */
    private Long operatingCosts;

    /**
     * 营业利润
     */
    private Long operatingProfits;

    /**
     * 营业收入
     */
    private Long operatingIncome;

    /**
     * 净利润
     */
    private Long netprofit;

    private String cId;

    private static final long serialVersionUID = 1L;
}