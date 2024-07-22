package com.example.facebookbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    private String id;
    private String postId;
    private String userId;
    private String content;

    // Getters and Setters
}
