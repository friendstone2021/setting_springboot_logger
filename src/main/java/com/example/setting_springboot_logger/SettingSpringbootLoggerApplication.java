package com.example.setting_springboot_logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SettingSpringbootLoggerApplication {

    private static final Logger logger = LoggerFactory.getLogger(SettingSpringbootLoggerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SettingSpringbootLoggerApplication.class, args);
        logger.debug("Hello World");
    }

}
