package com.wcy.controller;

import com.wcy.model.Student;
import com.wcy.service.DevService;
import com.wcy.service.ProdService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Resource
    private Student student;

    //注入对象 required = false,容器中没有DevService对象,正常执行
    //required = true:说明DevService bean 必然存在,如果容器中没有DevService对象,则报错.
    @Autowired(required = false)
    private DevService devService;

    @Autowired(required = false)
    private ProdService prodService;

    @Resource
    private Environment env;
    @GetMapping("/profiles")
    public String getProfile(){
        String[] activeProfiles = env.getActiveProfiles();
        for (String activeProfile : activeProfiles) {
            System.out.println(activeProfile);
        }
        return "当前环境是"+student.getName()+"年龄是"+student.getAge()
                +".环境是"+activeProfiles[0]
                +".devService"+devService
                +".prodService"+prodService;
    }
}
