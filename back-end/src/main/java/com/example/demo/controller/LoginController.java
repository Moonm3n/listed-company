package com.example.demo.controller;

import com.example.demo.common.api.CommonResult;
import com.example.demo.dto.LoginParam;
import com.example.demo.mbg.TUsr;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @PostMapping("/login")
    @ResponseBody
    public CommonResult login(@RequestBody LoginParam loginParam, BindingResult result){
        String token = loginService.login(loginParam.getUsername(), loginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @PostMapping("/register")
    @ResponseBody
    public CommonResult<TUsr> register(@RequestBody TUsr tUsr, BindingResult result){
        TUsr newtUser = loginService.register(tUsr);
        if (newtUser == null) {
            CommonResult.failed();
        }
        return CommonResult.success(newtUser);
    }
}
