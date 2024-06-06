package com.microservice.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.auth.dto.UserDTO;
import com.microservice.auth.service.UserService;
import com.microservice.response.ApiResponse;

@RestController
@RequestMapping("/api")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping(value = { "/register" }, consumes = {"application/xml","application/json"})
    public ResponseEntity<ApiResponse<UserDTO>> register(@RequestBody UserDTO newUser){
        UserDTO userDTO = userService.createUser(newUser);
        ApiResponse<UserDTO> apiResponse = new ApiResponse<>(userDTO, "User registered successfully");
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
}