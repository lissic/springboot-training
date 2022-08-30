package com.zero.springboot.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zero
 * @description MyInitializer
 * @date 2022/8/27 11:48
 */
public class MyInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("==============模拟对Spring容器执行初始化===============");
    }
}
