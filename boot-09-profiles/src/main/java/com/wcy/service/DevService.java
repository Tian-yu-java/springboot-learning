package com.wcy.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
//dev环境下存在bean
@Component
@Profile("dev")
public class DevService {
}
