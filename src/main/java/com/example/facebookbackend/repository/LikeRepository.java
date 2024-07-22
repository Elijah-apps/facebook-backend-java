package com.example.facebookbackend.repository;

import com.example.facebookbackend.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, String> {
}
