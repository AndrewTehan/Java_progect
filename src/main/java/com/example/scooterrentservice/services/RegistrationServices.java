package com.example.scooterrentservice.services;

import com.example.scooterrentservice.models.User;
import com.example.scooterrentservice.repositories.UserRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegistrationServices
{
    public void Register(UserRepository repository, User user)
    {
//        add validation

        repository.save(user);
    }
}
