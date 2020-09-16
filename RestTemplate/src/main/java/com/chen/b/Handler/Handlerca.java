package com.chen.b.Handler;

import com.chen.b.entiy.bookadmina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/Ck")
public class Handlerca {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/findAll")
    public List<bookadmina> findAll(){
        return  restTemplate.getForEntity("http://localhost:8010/Xa/findAll",List.class).getBody();   //List.class加载List集合 取出List集合中所有的数=数据
    }
//    @GetMapping("/findAll2")
//    public  List<bookadmina> findAll2(){
//        return  restTemplate.getForObject("http://localhost:8010/Xa/findAll2",List.class);
//    }
     @GetMapping("/ById/{id}")
    public  bookadmina findById(@PathVariable("id") Integer id){
        return  restTemplate.getForObject("http://localhost:8010/Xa/ById/{id}",bookadmina.class,id);    //加载bookadmina.class  传id 通过id查询
     }

//     @PostMapping("/save")
//    public  bookadmina save(@RequestBody bookadmina bookadmina){
//        return  restTemplate.postForObject("http://localhost:8010/Xa/save", bookadmina,bookadmina.getClass());
//     }
//     @PutMapping("/update")
//    public  bookadmina update(@RequestBody bookadmina bookadmina){
//        return  restTemplate.put("http://localhost:8010/Xa/update",bookadmina, bookadmina);
//     }
    @DeleteMapping("/deleteById/{id}")
    public  void  delete(@PathVariable("id") Integer id){
          restTemplate.delete("http://localhost:8010/Xa/deleteById/{id}",id);            //通过id删除
    }

}
