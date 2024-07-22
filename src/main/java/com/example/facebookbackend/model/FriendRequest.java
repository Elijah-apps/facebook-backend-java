package com.example.facebookbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FriendRequest {
    @Id
    private String id;
    private String fromUserId;
    private String toUserId;
    private String status;

    // Getters and Setters
}
