package com.hy.h.Handler;

import com.Feign.a.entiy.bookadmina;
import com.hy.h.entiyc.Feiginac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hystrix")
public class Handlerola {
    @Autowired
    private Feiginac feiginac;
    @GetMapping("/findAll")
    public List<bookadmina> findAll(){
        return feiginac.findAll();
    }
    @GetMapping("/indexa")
    public String indexa(){
        return feiginac.indexa();
    }
}
