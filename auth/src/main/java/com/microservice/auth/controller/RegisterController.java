package com.microservice.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.auth.dto.UserDTO;
import com.microservice.auth.service.UserService;

@RestController
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping(value = { "/registerUser" }, consumes = {"application/xml","application/json"})
    public void register(@RequestBody UserDTO newUser){
        userService.createUser(newUser);
    }
}