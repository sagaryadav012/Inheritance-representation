package com.lld.ecommercedemo.TablePerClass;

import jakarta.persistence.*;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity(name = "tpc_users")
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
}
