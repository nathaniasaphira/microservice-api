package com.microservice.auth.service;

import com.microservice.auth.dto.request.RegisterRequest;

public interface UserService {

    /**
     * 
     * @param username
     * @return
     */
    RegisterRequest getUserByUsername(String username);
    
    /**
     * 
     * @param userDTO
     * @return
     */
    RegisterRequest createUser(RegisterRequest userDTO);
    
}
