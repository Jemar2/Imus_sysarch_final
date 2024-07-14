package com.bangkas.sysarchbangkas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bangkas.sysarchbangkas.model.User;
import com.bangkas.sysarchbangkas.repository.UserRepository;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String signup(String id, String username, String password, String email) {
        if (userRepository.findByUsername(username).isPresent()) {
            return "Username already exists!";
        }

        User user = new User(username, password);
        user.setId(id);
        user.setEmail(email);

        userRepository.save(user);

        return "Signup successfully!";
    }

    public String login(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsername(username);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                return "Login successfully!";
            } else {
                return "Invalid credentials!";
            }
        } else {
            return "User not found!";
        }
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }
}
