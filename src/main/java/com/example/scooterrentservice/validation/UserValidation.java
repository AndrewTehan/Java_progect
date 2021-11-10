package com.example.scooterrentservice.validation;

import com.example.scooterrentservice.models.User;

public class UserValidation {
    public Boolean isUserValid(User user){
        if(user.getPassword().equals("") && user.getName().equals(""))
        return false;
        return true;
    }
}
