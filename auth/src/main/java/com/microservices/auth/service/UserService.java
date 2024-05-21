package com.microservices.auth.service;

import com.microservices.auth.entity.User;

public interface UserService {
    
    /**
     * Save a new user to database
     * @param user The user object to be saved
     * @return The saved user object
     */
    User saveUser(User user);
    
    /**
     * Find user based on given username
     * @param username The username of the user to be retrieved
     * @return The user object with given username
     */
    User findByUsername(String username);
}
