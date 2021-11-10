package com.example.scooterrentservice.services;

import com.example.scooterrentservice.models.Rent;
import com.example.scooterrentservice.repositories.RentRepository;

public class RentsControllerServices extends Services {
    public void Register(RentRepository repository, Rent rent)
    {
//        add validation

        repository.save(rent);
    }
}
