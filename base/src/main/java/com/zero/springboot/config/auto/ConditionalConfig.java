package com.zero.springboot.config.auto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

/**
 * @author zero
 * @description ConditionalConfig
 * @date 2022/8/30 9:53
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(name = "com.mysql.cj.jdbc.Driver")
public class ConditionalConfig {
    /*@Bean
    public User user() {
        return new User();
    }*/
}
