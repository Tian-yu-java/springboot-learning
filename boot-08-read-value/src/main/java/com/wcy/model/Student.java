package com.wcy.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Student类的属性名称和配置文件中的key一样
//prefix:前缀
@Component
@ConfigurationProperties(prefix = "zhangsan")
public class Student {
    private  String name;
    private  Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {


        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
