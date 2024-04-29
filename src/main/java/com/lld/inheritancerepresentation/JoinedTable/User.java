package com.lld.ecommercedemo.JoinedTable;

import com.lld.ecommercedemo.MappedSuperClass.BaseModel;
import jakarta.persistence.*;

@Entity(name = "jt_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}
