package com.Feign.a.Handler.impl;

import com.Feign.a.Handler.Feiginac;
import com.Feign.a.entiy.bookadmina;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FeignErro  implements Feiginac {

    @Override
    public List<bookadmina> findAll() {
        return null;
    }

    @Override
    public String indexa() {
        return "服务器正在维护中";
    }
}
