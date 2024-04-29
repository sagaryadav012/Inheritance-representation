package com.lld.ecommercedemo.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_learners")
public class Learner extends User{
    private String college;
    private String company;
}
