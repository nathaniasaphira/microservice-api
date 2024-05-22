package com.microservice.auth.dto;

import com.microservice.auth.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequestDTO {

    private String username;
    private String password;
    
}
