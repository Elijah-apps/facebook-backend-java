package com.example.facebookbackend.repository;

import com.example.facebookbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
