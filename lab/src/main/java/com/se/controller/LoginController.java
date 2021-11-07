package com.se.controller;


import com.se.dto.UserDTO;
import com.se.service.LoginService;
import com.se.service.LoginServiceImpl;
import com.se.util.JWTUtils;
import com.se.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

@RequestMapping("login")
public class LoginController {

    @Autowired
    LoginService loginService;

//    @ApiOperation(value="登录（返回TOKEN）")
    @PostMapping
    public Msg loginWithToken(@RequestBody UserDTO userDTO){ //传过来的json包装成实体
//        System.out.println(userDTO);
        return loginService.Login(userDTO);
    }

}
