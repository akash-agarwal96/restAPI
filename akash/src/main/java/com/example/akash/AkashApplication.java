package com.example.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class AkashApplication {
  //Main
    public static void main(String[] args) {
        SpringApplication.run(AkashApplication.class, args);
    }
}