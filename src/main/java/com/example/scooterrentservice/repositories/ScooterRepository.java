package com.example.scooterrentservice.repositories;

import com.example.scooterrentservice.models.Scooter;
import org.springframework.data.repository.CrudRepository;

public interface ScooterRepository extends CrudRepository<Scooter, Long> {
}
