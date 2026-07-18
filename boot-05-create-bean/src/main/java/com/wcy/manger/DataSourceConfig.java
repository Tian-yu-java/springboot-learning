package com.wcy.manger;

import com.wcy.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

//创建配置类(相当于spring的xml配置文件):声明多个bean对象
//new DataSourceConfig()
@Configuration(proxyBeanMethods = false)
public class DataSourceConfig {
    //定义方法.1.方法的返回值是java对象.
    // 2.方法上面声明@Bean

    @Bean("date")
    //默认@Bean创建的bean对象名称是方法名
    public Date myDate() {
        Date date=new Date();
        date.setTime(System.currentTimeMillis());
        return date;
    }

    @Bean
    public UserDao myUserDao(Date myDate/*俩个bean之间有联系就得用spring代理功能,不能为false*/){
        return new UserDao();
    }
}
