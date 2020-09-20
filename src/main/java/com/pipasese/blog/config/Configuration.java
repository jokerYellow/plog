package com.pipasese.blog.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Configuration {

    @Value("${name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @Value("${banner}")
    private String banner;
}
