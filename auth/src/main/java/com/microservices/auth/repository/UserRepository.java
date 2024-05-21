package com.microservices.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservices.auth.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
