package com.microservice.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.microservice.auth.dto.UserDTO;
import com.microservice.auth.entity.User;
import com.microservice.auth.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
private PasswordEncoder passwordEncoder;

    @Override
    public UserDTO getUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("Unable to find user with username: " + username);
        }

        return UserDTO.fromUser(user);
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        String encodedPassword = passwordEncoder.encode(userDTO.getPassword());
        userDTO.setPassword(encodedPassword);

        User user = User.fromUserDTO(userDTO);
        user = userRepository.save(user);

        return UserDTO.fromUser(user);
    }
    
}
