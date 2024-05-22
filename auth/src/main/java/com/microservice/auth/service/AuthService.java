package com.microservice.auth.service;

import com.microservice.auth.dto.UserDTO;

public interface AuthService {

    /**
     * 
     * @param username
     * @param password
     * @return
     */
    UserDTO login(String username, String password);
}
