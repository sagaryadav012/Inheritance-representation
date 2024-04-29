package com.lld.ecommercedemo.MappedSuperClass;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
}
