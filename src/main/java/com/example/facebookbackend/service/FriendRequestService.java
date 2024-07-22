package com.example.facebookbackend.service;

import com.example.facebookbackend.model.FriendRequest;
import com.example.facebookbackend.repository.FriendRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FriendRequestService {

    @Autowired
    private FriendRequestRepository friendRequestRepository;

    public FriendRequest sendFriendRequest(FriendRequest friendRequest) {
        return friendRequestRepository.save(friendRequest);
    }

    public Optional<FriendRequest> getFriendRequestById(String requestId) {
        return friendRequestRepository.findById(requestId);
    }

    public void acceptFriendRequest(String requestId) {
        Optional<FriendRequest> friendRequest = friendRequestRepository.findById(requestId);
        if (friendRequest.isPresent()) {
            FriendRequest request = friendRequest.get();
            request.setStatus("Accepted");
            friendRequestRepository.save(request);
        }
    }

    public void rejectFriendRequest(String requestId) {
        Optional<FriendRequest> friendRequest = friendRequestRepository.findById(requestId);
        if (friendRequest.isPresent()) {
            FriendRequest request = friendRequest.get();
            request.setStatus("Rejected");
            friendRequestRepository.save(request);
        }
    }

    public List<FriendRequest> getAllFriendRequests() {
        return friendRequestRepository.findAll();
    }
}
