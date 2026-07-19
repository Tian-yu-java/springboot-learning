package com.wcy;

import com.wcy.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//在配置类上面加入注解
@EnableConfigurationProperties({Student.class})
@SpringBootApplication
public class Boot08ReadValueApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot08ReadValueApplication.class, args);
    }

}
