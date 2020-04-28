package com.example.mango3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.example.mango3"})

//@MapperScan("com.example.mango3.dao")
@SpringBootApplication
public class Mango3Application {

    public static void main(String[] args) {
        SpringApplication.run(Mango3Application.class, args);
    }

}
