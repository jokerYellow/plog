package com.pipasese.blog.config;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;

import java.util.Properties;

@Data
@org.springframework.context.annotation.Configuration
public class Configuration implements InitializingBean {

    @Value("${blog.title}")
    private String blogTitle;

    @Value("${name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @Value("${banner}")
    private String banner;

    @Value("${bbq:123321}")
    private String bbq;

    @EventListener(ContextRefreshedEvent.class)
    protected void logSystemProperties() {
        Properties pros = System.getProperties();
        pros.list(System.out);

    }
    @Autowired
    private Environment environment;

    @Override
    public void afterPropertiesSet() throws Exception {
        environment.getActiveProfiles();
    }

    public String[] getActiveProfile() {
        return environment.getActiveProfiles();
    }
}
