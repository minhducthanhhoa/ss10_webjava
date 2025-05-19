package com.data.sesson10_webjava.controller;

import com.data.sesson10_webjava.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/account")
public class AccountController {
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("account", new Account());
        return "registerForm";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("account") Account account, Model model) {

        model.addAttribute("message", "Đăng ký thành công cho người dùng: " + account.getUsername());
        return "registerSuccess";
    }
}
