package com.example.demo.mbg;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * t_company
 * @author 
 */
@Data
public class TCompany implements Serializable {
    /**
     * 公司编号
     */
    private String cId;

    /**
     * 公司所在地
     */
    private String cLocation;

    /**
     * 上市时间
     */
    private Date timeToMarket;

    /**
     * 公司名
     */
    private String cName;

    /**
     * 公司产业描述
     */
    private String cIndustry;

    /**
     * 公司联系电话
     */
    private String cTel;

    private static final long serialVersionUID = 1L;
}