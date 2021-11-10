package com.example.scooterrentservice.services;

import com.example.scooterrentservice.models.User;
import lombok.NoArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@NoArgsConstructor
public class Services {
    public ModelAndView ReturnView(String viewName) {
        ModelAndView modelAndView = new ModelAndView(viewName);
        return modelAndView;
    }

    public void AddNewUserAttr(Model model) {
        User user = new User();
        model.addAttribute("user", user);
    }
}
