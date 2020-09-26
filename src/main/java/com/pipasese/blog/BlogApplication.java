package com.pipasese.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pipasese.blog.dao")
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BlogApplication.class);
        application.run(args);
    }

}
