package com.zero.springboot.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.env.PropertiesPropertySourceLoader;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @author zero
 * @description MyEnvironmentPostProcessor
 * @date 2022/8/27 11:50
 */
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    private final PropertiesPropertySourceLoader loader = new PropertiesPropertySourceLoader();

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        // 定义自定义的配置文件
        Resource path = new ClassPathResource("env.properties");
        // 加载自定义的配置文件
        PropertySource<?> ps = loadProperty(path);
        System.out.println("zero.name:" + ps.getProperty("zero.name"));
        System.out.println("zero.name:" + ps.getProperty("zero.age"));
        // 将自定义配置加载到Environment配置环境中
        environment.getPropertySources().addLast(ps);
    }

    private PropertySource<?> loadProperty(Resource path) {
        if (!path.exists()) {
            throw new IllegalArgumentException("配置文件不存在。。。。");
        }
        try {
            return this.loader.load("custom-resource", path).get(0);
        } catch (IOException e) {
            throw new IllegalStateException("加载配置文件出现错误:" + path, e);
        }
    }
}
