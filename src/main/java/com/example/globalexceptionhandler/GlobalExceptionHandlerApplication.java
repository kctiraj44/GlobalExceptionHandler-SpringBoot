package com.example.globalexceptionhandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GlobalExceptionHandlerApplication {

    public static void main(String[] args) {
        System.out.println("Added all the dependency");
        SpringApplication.run(GlobalExceptionHandlerApplication.class, args);
    }

}
