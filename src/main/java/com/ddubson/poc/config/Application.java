package com.ddubson.poc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.ddubson.poc.config",
        "com.ddubson.poc.controllers",
        "com.ddubson.poc.repository",
        "com.ddubson.poc.model",
        "com.ddubson.poc.service",
        "com.ddubson.poc.core"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Application {
    static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Throwable {
        log.info("Starting app.");
        SpringApplication.run(Application.class, args);
    }
}
