package com.wcy.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!prod")
public class ProdService {
    //除了prod环境.其他都会加载
}
