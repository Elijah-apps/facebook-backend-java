package com.example.facebookbackend.controller;

import com.example.facebookbackend.model.Comment;
import com.example.facebookbackend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @GetMapping("/{commentId}")
    public Optional<Comment> getCommentById(@PathVariable String commentId) {
        return commentService.getCommentById(commentId);
    }

    @PutMapping("/{commentId}")
    public Comment updateComment(@RequestBody Comment comment, @PathVariable String commentId) {
        comment.setId(commentId);
        return commentService.updateComment(comment);
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable String commentId) {
        commentService.deleteComment(commentId);
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }
}
