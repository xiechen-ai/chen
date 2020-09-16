package com.hy.h.entiyc;

import com.Feign.a.entiy.bookadmina;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "proft")
public interface Feiginac {
    @GetMapping("/Xa/findAll")
    public List<bookadmina> findAll();
    @GetMapping("/Xa/indexa")
    public  String indexa();
}
