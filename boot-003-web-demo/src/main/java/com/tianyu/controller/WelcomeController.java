package com.tianyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/hello")
    public String welcome(){
        return"欢迎来到Springboot";
    }

}
