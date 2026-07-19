package com.wcy.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadFileController {

    //@Value("${key}")
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${server.port}")
    private Integer port;

    //@Value("${key:默认值}"),当key不存在时
    @Value("${app.info}")
    private String info;

    @Value("${JAVA_HOME}")
    private String javaHome;

    @GetMapping("/readvalue")
    public String readConfig(){

        return "Spring boot4学习指南:"+applicationName+":"+contextPath+":"+port+":"+info+":"+javaHome;
    }

    @Resource
    private Environment env;

    @GetMapping("/readenv")
    public String readEnv(){
        String appName = env.getProperty("spring.application.name");
        String port = env.getProperty("server.port");
        String javaHome = env.getProperty("JAVA_HOME");
        return "springboot4学习指南:"+appName+"="+port+"="+javaHome;
    }

}
