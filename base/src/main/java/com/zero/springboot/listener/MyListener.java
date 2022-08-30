package com.zero.springboot.listener;

import org.springframework.beans.BeansException;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zero
 * @description MyListener
 * @date 2022/8/27 11:45
 */
public class MyListener implements ApplicationContextAware, ApplicationListener<ApplicationStartedEvent> {
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        ConfigurableApplicationContext context = event.getApplicationContext();
        if (ctx == context) {
            System.out.println("----------触发事件的容器与监听器所在的容器相同");
        }
        System.out.println("==============执行自定义处理==================");
    }
}
