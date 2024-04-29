package com.lld.ecommercedemo.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_tas")
@PrimaryKeyJoinColumn(name = "user_id")
public class Ta extends User {
    private int no_of_questions;
    private String college;

}
