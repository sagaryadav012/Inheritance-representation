package com.lld.ecommercedemo.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_tas")
public class Ta extends User {
    private int no_of_questions;
    private String college;

}
