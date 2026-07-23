package com.wcy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    // /welcome 自定义的字符, 是uri, 表示请求的入口(访问的资源)
    public String welcome(){
        return "欢迎来到springboot,SpringMVC模块基于HTTp协议的处理请求";
    }
}
