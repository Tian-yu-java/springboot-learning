package com.wcy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // /hello是uri(api接口的访问地址)
    @GetMapping("/hello")
    public String hello(){

        return "hello,world";
    }
}
