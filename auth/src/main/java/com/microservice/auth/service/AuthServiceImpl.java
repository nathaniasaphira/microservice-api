package com.microservice.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.microservice.auth.dto.response.LoginResponse;
import com.microservice.auth.entity.User;
import com.microservice.auth.repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Override
    public LoginResponse login(String username, String password) {
        User user = userRepository.findByUsername(username);

        if (user == null || !passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid username or password");
        }

        String token = generateToken(user);
        if (token != null){
            return new LoginResponse("Login successful", token);    
        }

        return new LoginResponse("Login failed", token);
    }

    private String generateToken(User user) {
        return "the-generated-token";
    }
}
