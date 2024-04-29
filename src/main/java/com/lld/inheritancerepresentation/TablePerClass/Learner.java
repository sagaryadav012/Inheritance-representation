package com.lld.ecommercedemo.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_learners")
public class Learner extends User {
    private String college;
    private String company;
}
