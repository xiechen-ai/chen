package com.ak.ac.entiy;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class bookadmina {
    @Id
    private  Integer id;
    @Column
    private  String name;
    @Column
    private  String  password;
}
