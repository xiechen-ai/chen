package com.Feign.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Feignla {
    public static void main(String[] args) {
        SpringApplication.run(Feignla.class,args);
    }
}
