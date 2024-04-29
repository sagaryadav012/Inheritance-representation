package com.lld.ecommercedemo.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "1")
public class Learner extends User {
    private String college;
    private String company;
}
