package com.lld.inheritancerepresentation.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_learners")
public class Learner extends User{
    private String college;
    private String company;
}
