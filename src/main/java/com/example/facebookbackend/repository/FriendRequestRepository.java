package com.example.facebookbackend.repository;

import com.example.facebookbackend.model.FriendRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRequestRepository extends JpaRepository<FriendRequest, String> {
}
