package com.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.book.*")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
