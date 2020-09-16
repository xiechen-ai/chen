package com.chen.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClAC {
    public static void main(String[] args) {
        SpringApplication.run(ClAC.class,args);
    }
}
