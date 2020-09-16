package com.chen.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Springd {
    public static void main(String[] args) {
        SpringApplication.run(Springd.class,args);
    }
    //提供RestTemplate实例  将实例添加到ioc容器中
    @Bean          //ioc容器
    //创建RestTemplate实例  返回RestTemplate  之后注入可以使用RestTemplate 调方法
     public  RestTemplate restTemplate(){
        return  new RestTemplate();
     }
}
