package com.ffucks;

import org.springframework.boot.SpringApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
