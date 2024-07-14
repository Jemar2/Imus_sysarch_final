package com.bangkas.sysarchbangkas.controller;

import com.bangkas.sysarchbangkas.model.User;
import com.bangkas.sysarchbangkas.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public String signup(@RequestParam String id, @RequestParam String username, @RequestParam String password, @RequestParam String email) {
        return authService.signup(id, username, password, email);
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return authService.login(username, password);
    }

    @GetMapping("/getUserById")
    public Optional<User> getUserById(@RequestParam String id) {
        return authService.getUserById(id);
    }
}
