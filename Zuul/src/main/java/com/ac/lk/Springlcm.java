package com.ac.lk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableAutoConfiguration
public class Springlcm {
    public static void main(String[] args) {
        SpringApplication.run(Springlcm.class,args);
    }
}
