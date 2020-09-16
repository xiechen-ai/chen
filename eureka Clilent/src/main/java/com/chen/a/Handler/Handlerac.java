package com.chen.a.Handler;

import com.chen.a.entiy.bookadmina;
import com.chen.a.entiyac.Bookadmina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Xa")
public class Handlerac {
    @Autowired
    private Bookadmina bookadminac;
    @Value("${server.port}")
    private  String  chen;
    @GetMapping("/findAll")
    public List<bookadmina> findAll(){

        return  bookadminac.findAll();
    }
    @GetMapping("/ById/{id}")   //取出id
    public  bookadmina ById(@PathVariable("id") Integer id){
        return bookadminac.findById(id).get();
    }

    @GetMapping("/findAll/{page}/{size}")
    public Page<bookadmina> findAll(@PathVariable("page") Integer page,@PathVariable("size") Integer size){
        Pageable pageable= PageRequest.of(page-1,size);
        return  bookadminac.findAll(pageable);
    }
    @PostMapping("/save")
    public  bookadmina save(@RequestBody bookadmina bookadmina){
        return  bookadminac.save(bookadmina);
    }
    @PutMapping("/update")
    public  bookadmina update(@RequestBody bookadmina bookadmina){
            return  bookadminac.save(bookadmina);
    }
    @DeleteMapping("/delete/{id}")
    public  void  delete(@PathVariable("id") Integer id){
          bookadminac.deleteById(id);
    }
    @GetMapping("/indexa")
    public String  indexa(){
        return "当前端口号:"+this.chen;
    }
}
