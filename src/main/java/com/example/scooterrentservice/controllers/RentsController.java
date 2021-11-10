package com.example.scooterrentservice.controllers;

import com.example.scooterrentservice.models.Rent;
import com.example.scooterrentservice.models.User;
import com.example.scooterrentservice.repositories.RentRepository;
import com.example.scooterrentservice.repositories.UserRepository;
import com.example.scooterrentservice.services.RegistrationServices;
import com.example.scooterrentservice.services.RentsControllerServices;
import com.example.scooterrentservice.services.UserControllerServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping
public class RentsController {
    @Autowired
    private RentRepository rentRepository;

    private static RentsControllerServices rentControllerService;

    static
    {
        rentControllerService = new RentsControllerServices();
    }

    @GetMapping(value = { "/rents/new" })
    public ModelAndView New(Model model)
    {
        rentControllerService.AddNewUserAttr(model);
        return rentControllerService.ReturnView("UsersNew");
    }

    @PostMapping(value = { "/rents/create" })
    public ModelAndView Create(Model model, @ModelAttribute("rent") Rent rent)
    {
        rentControllerService.Register(rentRepository, rent);
        return rentControllerService.ReturnView("UsersShow");
    }
}
