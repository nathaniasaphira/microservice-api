package com.microservice.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.auth.dto.request.RegisterRequest;
import com.microservice.auth.dto.response.RegisterResponse;
import com.microservice.auth.service.UserService;

@RestController
@RequestMapping("/api")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping(value = { "/register" }, consumes = {"application/xml","application/json"})
    public ResponseEntity<?> register(@RequestBody RegisterRequest newUser){
        userService.createUser(newUser);

        RegisterResponse responseMessage = new RegisterResponse("success");
        return ResponseEntity.ok(responseMessage);
    }
}