package com.chen.b.entiy;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data   //实体类
@Entity    //映射数据库表  实体类名称要与数据库表名称 相等
public class bookadmina {
    @Id    //映射id字段
    private  Integer id;
    @Column   //映射name字段
    private  String name;
    @Column      //映射password字段
    private  String  password;
}
