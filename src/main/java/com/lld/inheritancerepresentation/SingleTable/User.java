package com.lld.ecommercedemo.SingleTable;

import jakarta.persistence.*;

@Entity(name = "st_users")
@Inheritance
@DiscriminatorColumn(
        name = "user_type",
        discriminatorType = DiscriminatorType.INTEGER
)
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
}
