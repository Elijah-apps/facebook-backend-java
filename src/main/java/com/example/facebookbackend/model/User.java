package com.example.facebookbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;

    // Getters and Setters
}
