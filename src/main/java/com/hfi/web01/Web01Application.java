package com.hfi.web01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfigureBefore
@MapperScan({"com.hfi.web01.mapper","com.hfi.web01.mybatisPlus.mapper"})
public class Web01Application {
    public static void main(String[] args) {
        SpringApplication.run(Web01Application.class, args);
    }
}
