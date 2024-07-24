package com.lld.inheritancerepresentation.MappedSuperClass;


import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}
