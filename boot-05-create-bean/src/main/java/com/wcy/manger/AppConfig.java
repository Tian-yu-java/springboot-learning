package com.wcy.manger;

import com.wcy.model.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Student.class, BeanManagerReg.class})//里面括号为了可以同时导入多个类用逗号隔开
public class AppConfig {
}
