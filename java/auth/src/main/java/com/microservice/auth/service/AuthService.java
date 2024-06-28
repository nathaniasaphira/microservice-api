package com.microservice.auth.service;

import com.microservice.auth.dto.response.LoginResponse;

public interface AuthService {

    /**
     * 
     * @param username
     * @param password
     * @return
     */
    LoginResponse login(String username, String password);
}
