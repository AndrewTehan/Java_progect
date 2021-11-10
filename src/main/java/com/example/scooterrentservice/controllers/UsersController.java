package com.example.scooterrentservice.controllers;

import com.example.scooterrentservice.models.User;
import com.example.scooterrentservice.repositories.UserRepository;
import com.example.scooterrentservice.services.RegistrationServices;
import com.example.scooterrentservice.services.UserControllerServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping
public class UsersController {
    @Autowired
    private UserRepository userRepository;

    private static UserControllerServices usersControllerService;
    private static RegistrationServices registrationServices;

    static
    {
        registrationServices = new RegistrationServices();
        usersControllerService = new UserControllerServices();
    }

    @GetMapping(value = { "/users/new" })
    public ModelAndView New(Model model)
    {
        usersControllerService.AddNewUserAttr(model);
        return usersControllerService.ReturnView("UsersNew");
    }

    @PostMapping(value = { "/users/create" })
    public ModelAndView Create(Model model, @ModelAttribute("user") User user)
    {
        registrationServices.Register(userRepository, user);
        return usersControllerService.ReturnView("UsersShow");
    }
}
