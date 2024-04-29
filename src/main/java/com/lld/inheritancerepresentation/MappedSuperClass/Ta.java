package com.lld.ecommercedemo.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_tas")
public class Ta extends User{
    private int no_of_questions;
    private String college;

}
