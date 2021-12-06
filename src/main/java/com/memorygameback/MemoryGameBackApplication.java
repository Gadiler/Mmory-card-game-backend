package com.memorygameback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com")
@EnableScheduling
public class MemoryGameBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoryGameBackApplication.class, args);
        System.out.println("IoC was loaded!");
    }

}
