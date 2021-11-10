package com.example.scooterrentservice.repositories;


import com.example.scooterrentservice.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}