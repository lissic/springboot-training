package com.zero.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zero
 * @description PortController
 * @date 2022/9/2 9:33
 */
@RestController
public class PortController {
    @Autowired
    private WebServerApplicationContext ctx;

    @GetMapping
    public String getPort() {
        return "Http运行端口为：" + ctx.getWebServer().getPort();
    }
}
