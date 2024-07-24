package com.lld.inheritancerepresentation.SingleTable;

import jakarta.persistence.*;

@Entity(name = "st_users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "user_type",
        discriminatorType = DiscriminatorType.INTEGER
)
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
}