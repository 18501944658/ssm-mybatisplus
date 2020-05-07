package com.itszt.ssmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.itszt")
@MapperScan(basePackages = {"com.itszt.dao"})
public class SsMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsMybatisplusApplication.class, args);
    }

}
