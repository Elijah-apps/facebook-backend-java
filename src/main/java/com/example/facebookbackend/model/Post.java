package com.example.facebookbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    private String id;
    private String userId;
    private String content;

    // Getters and Setters
}
