package com.lld.ecommercedemo.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "2")
public class Mentor extends User {
    private double avg_rating;
    private String company;

}
