package com.example.demo.mbg;

import lombok.Data;

import java.io.Serializable;

/**
 * t_balance_sheet
 * @author 
 */
@Data
public class TBalanceSheet implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    private String bYear;

    /**
     * 负债合计
     */
    private Long totalLiabilities;

    /**
     * 平均存货
     */
    private Long averageInventory;

    /**
     * 平均应收账款
     */
    private Long averageAccountsReceivable;

    /**
     * 平均实收资本
     */
    private Long averagePaidInCapital;

    /**
     * 平均所有者权益
     */
    private Long averageOwnerEquity;

    /**
     * 流动负债合计
     */
    private Long totalCurrentLiabikities;

    /**
     * 平均流动资产
     */
    private Long averageCurrentAssets;

    /**
     * 平均总资产
     */
    private Long averageTotalAssets;

    private String cId;

    private static final long serialVersionUID = 1L;
}