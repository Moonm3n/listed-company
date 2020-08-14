package com.example.demo.service;

import com.example.demo.mbg.TUsr;

/**
 * 登陆Service
 */
public interface LoginService {
    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    TUsr getUserByUsername(String username);

    /**
     * 登陆功能
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * 注册功能
     */
    TUsr register(TUsr tUsr);

}
