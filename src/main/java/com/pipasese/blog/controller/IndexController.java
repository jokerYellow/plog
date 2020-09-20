package com.pipasese.blog.controller;

import com.pipasese.blog.config.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {

    @Resource
    private Configuration configuration;

    @GetMapping
    public String index() {
        return "hello,world!" + configuration.getName() + configuration.getPort();
    }

    @GetMapping("/banner")
    public String banner() {
        return configuration.getBanner();
    }
}
