package com.lld.inheritancerepresentation.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "3")
public class Ta extends User {
    private int no_of_questions;
    private String college;

}
