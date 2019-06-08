package com.example.springboothello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(SpringbootHelloApplication.class, args);
    }

}
