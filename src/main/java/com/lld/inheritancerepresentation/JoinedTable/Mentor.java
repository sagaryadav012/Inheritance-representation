package com.lld.ecommercedemo.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_mentors")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    private double avg_rating;
    private String company;

}
