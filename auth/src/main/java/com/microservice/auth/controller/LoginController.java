package com.microservice.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.auth.dto.UserDTO;
import com.microservice.auth.service.AuthService;

@RestController
public class LoginController {

    @Autowired
    private AuthService authService;

    @PostMapping(value = { "/login" }, consumes = {"application/xml","application/json"})
    public ResponseEntity<UserDTO> login(@RequestBody UserDTO user) {
        return ResponseEntity.ok(authService.login(user.getUsername(), user.getPassword()));
    }

}
