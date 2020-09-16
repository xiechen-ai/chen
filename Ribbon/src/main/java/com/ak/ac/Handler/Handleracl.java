package com.ak.ac.Handler;

import com.ak.ac.entiy.bookadmina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/akl")
public class Handleracl {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/findAll")
    public List<bookadmina>findAll(){
          return  restTemplate.getForObject("http://proft/Xa/findAll",List.class);
    }
    @GetMapping("/index")
    public  String index(){
          return  restTemplate.getForObject("http://proft/Xa/index",String.class);
    }
}
