package com.example.demo.mbg;

import lombok.Data;

import java.io.Serializable;

/**
 * t_cash_flow_statement
 * @author 
 */
@Data
public class TCashFlowStatement implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    private String cId;

    private String cYear;

    /**
     * 经营活动产生的现金流量净额
     */
    private Long netCashFlowFrowFromOperatingActivities;

    /**
     * 投资活动产生的现金流量净额
     */
    private Long netCashFlowsFromInvestingActivities;

    /**
     * 筹资活动产生的现金流量净额
     */
    private Long netCashFlowsFromFinancingActivities;

    private static final long serialVersionUID = 1L;
}