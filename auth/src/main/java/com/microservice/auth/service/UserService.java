package com.microservice.auth.service;

import com.microservice.auth.dto.UserDTO;

public interface UserService {

    /**
     * 
     * @param username
     * @return
     */
    UserDTO getUserByUsername(String username);
    
    /**
     * 
     * @param userDTO
     * @return
     */
    UserDTO createUser(UserDTO userDTO);
    
}
