package com.cdut.javastudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.cdut.javastudy.dao"})
public class JavastudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavastudyApplication.class, args);
    }

}
