package com.wcy;

import com.wcy.model.Student;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

//在一个配置类(Configuration)实现  ApplicationRunner 或 CommandLineRunner接口
@EnableConfigurationProperties(Student.class)
@SpringBootApplication
@Order(2)
public class Boot10ProfilesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        //ApplicationContext容器对象创建好后,会执行 CommandLineRunner run()方法
        SpringApplication.run(Boot10ProfilesApplication.class, args);

    }
    @Resource
    private ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Springboot的容器对象(他立马有创建好的bean对象+)"+ ctx);
        Student bean;
        bean = ctx.getBean(Student.class);
        //访问数据库, 执行sql, 访问redis获取数据, 执行其他bean对象调用
        System.out.println(bean);

        System.out.println("CommandLineRunner接口"+args[0]);
    }
}
