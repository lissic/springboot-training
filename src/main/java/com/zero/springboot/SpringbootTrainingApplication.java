package com.zero.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Spring Boot加载配置文件的三种方式：
 *  1、通过ComponentScan扫描当前类及其子包下的所有类信息
 *  2、ImportResource加载指定配置文件中的类信息
 *  3、Import加载指定类信息
 */
@SpringBootApplication(scanBasePackages = {"com.zero.springboot.beans","com.zero.springboot.controller"})
@ImportResource("classpath:beans.xml")
@Import(com.zero.springboot.config.MyConfiguration.class)
public class SpringbootTrainingApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootTrainingApplication.class);
        application.setLazyInitialization(true);

    }

}
