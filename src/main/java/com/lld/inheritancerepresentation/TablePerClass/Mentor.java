package com.lld.ecommercedemo.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_mentors")
public class Mentor extends User {
    private double avg_rating;
    private String company;

}
