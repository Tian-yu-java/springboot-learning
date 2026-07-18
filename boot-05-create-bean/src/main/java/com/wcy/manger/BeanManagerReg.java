package com.wcy.manger;

import com.wcy.service.OffLineDiscountService;
import com.wcy.service.OnLineDiscountService;
import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

public class BeanManagerReg implements BeanRegistrar {
    //Environment环境对象,程序运行时需要的数据(代码之外的内容)
    @Override
    public void register(BeanRegistry registry, Environment env) {
        System.out.println("动态编程方式注册Bean");

        //判断当前是线上
        if (env.matchesProfiles("online")){
            //注册OnLineDiscountService
            registry.registerBean("onLineDiscountService",OnLineDiscountService.class,
                    Spec -> {
                        Spec.description("线上折扣类")
                                .lazyInit()
                                .order(-1);
                    });
        }else{
            registry.registerBean("offLineDiscountService",OffLineDiscountService.class);

        }

    }
}