package com.microservice.auth.entity;

import com.microservice.auth.dto.request.RegisterRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user", schema="public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public static User fromUserDTO(RegisterRequest userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());

        return user;
    }

    public RegisterRequest toUserDTO() {
        RegisterRequest userDto = new RegisterRequest();
        userDto.setUsername(username);
        userDto.setPassword(password);

        return userDto;
    }
    
}
