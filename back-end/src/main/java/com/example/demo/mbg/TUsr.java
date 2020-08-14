package com.example.demo.mbg;

import lombok.Data;

import java.io.Serializable;

/**
 * t_usr
 * @author 
 */
@Data
public class TUsr implements Serializable {
    /**
     * 用户名
     */
    private Integer usrId;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户姓名
     */
    private String usrName;

    /**
     * 1：男， 0:女
     */
    private Boolean gender;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 用户邮箱
     */
    private String mailbox;

    /**
     * 用户qq号
     */
    private String qq;

    /**
     * 用户手机号
     */
    private String tel;

    /**
     * 用户所在地
     */
    private String location;

    /**
     * 用户工作单位
     */
    private String workUnit;

    /**
     * 用户个人说明
     */
    private String introduction;

    private static final long serialVersionUID = 1L;
}