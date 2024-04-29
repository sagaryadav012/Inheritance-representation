package com.lld.ecommercedemo.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_learners")
@PrimaryKeyJoinColumn(name = "user_id")
public class Learner extends User {
    private String college;
    private String company;
}
