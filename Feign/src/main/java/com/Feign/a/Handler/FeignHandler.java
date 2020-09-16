package com.Feign.a.Handler;

import com.Feign.a.entiy.bookadmina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private  Feiginac feiginac;
    @GetMapping("/findAll")
    public List<bookadmina> findAll(){
        return  feiginac.findAll();
    }
}
