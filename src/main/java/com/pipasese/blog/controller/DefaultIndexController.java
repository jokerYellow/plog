package com.pipasese.blog.controller;

import com.pipasese.blog.config.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Profile("default")
public class DefaultIndexController {
    @Resource
    private Configuration configuration;

    @GetMapping
    public String index() {
        return "default:hello,world!" + configuration.getName() + configuration.getPort();
    }

    @GetMapping("/banner")
    public String banner() {
        return "default:" + configuration.getBanner() + configuration.getBbq();
    }

    @GetMapping("/activeProfiles")
    public String[] activeProfiles() {
        return configuration.getActiveProfile();
    }
}
