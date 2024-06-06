package com.microservice.auth.dto.request;

import com.microservice.auth.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private String username;
    private String password;

    public static RegisterRequest fromUser(User user) {
        RegisterRequest userDto = new RegisterRequest();
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        
        return userDto;
    }
    
}
