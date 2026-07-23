package com.wcy.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/add")
    public String addUser(String name, Integer age) {
        System.out.println("添加新用户");
        return "添加成功" + name + ":" + age;//是数据不是视图
    }
    //接受文件必须使用@RequestMapping
    @RequestMapping("/user/create")
    //@RequestParam:矫正参数名称, 将指定的名称参数绑定到形参
    //required 是否必须, 默认是true, 请求中必须纯在的参数, 当不确定是否纯在参数, 设置为假
    //defaultValue: 默认值, 没有提供userName的值
    public String createUser(@RequestParam(value = "userName", required =false,defaultValue = "springboot") String name,
                             @RequestParam("userAge") Integer age) {
        System.out.println("/user/create添加新用户");
        return "添加成功" + name + ":" + age;//是数据不是视图
    }
}
