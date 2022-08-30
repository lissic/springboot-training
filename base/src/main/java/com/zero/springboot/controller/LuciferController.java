package com.zero.springboot.controller;

import com.zero.springboot.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author zero
 * @description LuciferController
 * @date 2022/8/20 14:56
 */
@RestController
public class LuciferController {
    @Autowired
    private User user;
    @Autowired
    private DateFormat dateFormat;

    @GetMapping("/")
    public String lucifer() {
        return "I'm " + user.getUsername() + ":" + dateFormat.format(new Date());
    }
}
