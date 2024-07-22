package com.example.facebookbackend.controller;

import com.example.facebookbackend.model.FriendRequest;
import com.example.facebookbackend.service.FriendRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/friendrequests")
public class FriendRequestController {

    @Autowired
    private FriendRequestService friendRequestService;

    @PostMapping
    public FriendRequest sendFriendRequest(@RequestBody FriendRequest friendRequest) {
        return friendRequestService.sendFriendRequest(friendRequest);
    }

    @GetMapping("/{requestId}")
    public Optional<FriendRequest> getFriendRequestById(@PathVariable String requestId) {
        return friendRequestService.getFriendRequestById(requestId);
    }

    @PutMapping("/accept/{requestId}")
    public void acceptFriendRequest(@PathVariable String requestId) {
        friendRequestService.acceptFriendRequest(requestId);
    }

    @PutMapping("/reject/{requestId}")
    public void rejectFriendRequest(@PathVariable String requestId) {
        friendRequestService.rejectFriendRequest(requestId);
    }

    @GetMapping
    public List<FriendRequest> getAllFriendRequests() {
        return friendRequestService.getAllFriendRequests();
    }
}
