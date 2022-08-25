package com.zero.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.DateFormat;

/**
 * @author zero
 * @description MyConfiguration
 * @date 2022/8/20 12:51
 */
@Configuration
public class MyConfiguration {

    @Bean
    public DateFormat dateFormat() {
        return DateFormat.getDateInstance();
    }
}
