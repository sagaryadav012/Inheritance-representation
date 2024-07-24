package com.lld.inheritancerepresentation.JoinedTable;

import jakarta.persistence.*;

@Entity(name = "jt_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
}
