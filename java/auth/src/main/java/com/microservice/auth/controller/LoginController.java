package com.microservice.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.auth.dto.base.ErrorResponse;
import com.microservice.auth.dto.request.LoginRequest;
import com.microservice.auth.dto.response.LoginResponse;
import com.microservice.auth.service.AuthService;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private AuthService authService;

    @PostMapping(value = { "/login" }, consumes = {"application/xml","application/json"})
    public ResponseEntity<?> login(@RequestBody LoginRequest authRequest) {
        try {
            LoginResponse response = authService.login(authRequest.getUsername(), authRequest.getPassword());
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            ErrorResponse errorResponse = new ErrorResponse("InternalServerError", "An unexpected error occurred. Please try again later.");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

}
