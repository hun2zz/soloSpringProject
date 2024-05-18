package com.spring.solo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

    @SpringBootApplication
    @ServletComponentScan(basePackages = "com.spring.solo")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        }
}