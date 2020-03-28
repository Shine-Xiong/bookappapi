package com.tianyu.bookappapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tianyu.bookappapi.dao")
public class BookappapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookappapiApplication.class, args);
    }

}
