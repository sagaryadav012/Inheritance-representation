package com.lld.ecommercedemo.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_mentors")
public class Mentor extends User {
    private double avg_rating;
    private String company;

}
