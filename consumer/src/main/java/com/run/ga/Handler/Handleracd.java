package com.run.ga.Handler;

import com.run.ga.entiy.bookadmina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.annotation.Retention;
import java.util.List;

@RestController
@RequestMapping("/jak")
public class Handleracd {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/findAll")
    public List<bookadmina> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/Xa/findAll",List.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public  bookadmina findById(@PathVariable("id") Integer id){

        return  restTemplate.getForObject("http://localhost:8010/Xa/ById/{id}",bookadmina.class,id);
    }
    @DeleteMapping("/deleteById/{id}")
    public  void deleteById(@PathVariable("id") Integer id){
             restTemplate.delete("http://localhost:8010/Xa/deleteById/{id}",id);
    }
}
