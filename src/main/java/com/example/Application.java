package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot启动类
 * 
 * @author CodeGenerator
 * @date 2026-01-04
 */
@SpringBootApplication
@MapperScan("com.example.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("==========================================");
        System.out.println("应用启动成功！");
        System.out.println("==========================================");
    }
}