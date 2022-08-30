package com.zero.springboot.config.auto;

import com.zero.springboot.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zero
 * @description ConditionCustonConfig
 * @date 2022/8/30 10:40
 */
@Configuration(proxyBeanMethods = false)
public class ConditionCustomConfig {
    @Bean
    @ConditionalCustom({"com.zero.test","com.zero.abc"})
    public User user() {
        return  new User();
    }
}
