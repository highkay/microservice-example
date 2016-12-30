package io.microservice.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.microservice.example.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
