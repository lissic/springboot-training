package com.zero.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * @author zero
 * @description LogController
 * @date 2022/8/29 9:59
 */
@Slf4j
@RestController
public class LogController {
    // Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/log")
    public Map<String, Object> log() {
        log.trace("---------------Trace级别的日志------------");
        log.debug("---------------Debug级别的日志------------");
        log.info("----------------Info级别的日志-------------");
        log.warn("----------------Warn级别的日志-------------");
        log.error("---------------Error级别的日志------------");
        Map<String, Object> map = new HashMap<>();
        map.put("log", "Log");
        return map;
    }

}
