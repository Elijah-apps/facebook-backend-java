package com.example.facebookbackend.controller;

import com.example.facebookbackend.model.Like;
import com.example.facebookbackend.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/likes")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @PostMapping
    public Like addLike(@RequestBody Like like) {
        return likeService.addLike(like);
    }

    @GetMapping("/{likeId}")
    public Optional<Like> getLikeById(@PathVariable String likeId) {
        return likeService.getLikeById(likeId);
    }

    @DeleteMapping("/{likeId}")
    public void removeLike(@PathVariable String likeId) {
        likeService.removeLike(likeId);
    }

    @GetMapping
    public List<Like> getAllLikes() {
        return likeService.getAllLikes();
    }
}
