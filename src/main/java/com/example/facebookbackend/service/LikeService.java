package com.example.facebookbackend.service;

import com.example.facebookbackend.model.Like;
import com.example.facebookbackend.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public Like addLike(Like like) {
        return likeRepository.save(like);
    }

    public Optional<Like> getLikeById(String likeId) {
        return likeRepository.findById(likeId);
    }

    public void removeLike(String likeId) {
        likeRepository.deleteById(likeId);
    }

    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }
}
