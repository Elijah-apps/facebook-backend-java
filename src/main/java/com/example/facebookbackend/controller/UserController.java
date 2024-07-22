package com.example.facebookbackend.controller;

import com.example.facebookbackend.model.User;
import com.example.facebookbackend.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Tag(name = "User Controller", description = "APIs for user management")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Show login form")
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @Operation(summary = "Login a user")
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        User user = userService.login(email, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "profile";
        }
        return "login";
    }

    @Operation(summary = "Show registration form")
    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @Operation(summary = "Register a new user")
    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        userService.register(user);
        return "redirect:/login";
    }

    @Operation(summary = "Show user profile")
    @GetMapping("/profile")
    public String showProfile(Model model) {
        // Add logic to get the logged-in user's profile
        return "profile";
    }
}
