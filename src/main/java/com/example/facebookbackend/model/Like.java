package com.example.facebookbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Like {
    @Id
    private String id;
    private String postId;
    private String userId;

    // Getters and Setters
}
