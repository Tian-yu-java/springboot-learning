package com.wcy.manger;

import org.springframework.stereotype.Component;
//创建Bean对象,普通的,没有语义的
//对象在spring容器中的id为当前类名首字母小写
@Component(value = "myRedisClient")
public class RedisManager {
    public void doRedis(){
        //定义方法操作redis
        System.out.println("操作redis");
    }
}
