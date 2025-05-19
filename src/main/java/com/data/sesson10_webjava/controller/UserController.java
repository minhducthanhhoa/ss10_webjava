package com.data.sesson10_webjava.controller;

import com.data.sesson10_webjava.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/user-form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        model.addAttribute( "user", user);
        return "result";
    }
}
