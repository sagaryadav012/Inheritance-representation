package com.lld.inheritancerepresentation.TablePerClass;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE) // Cannot use IDENTITY
    private int id;
    private Date createdAt;
    private Date updatedAt;
}
