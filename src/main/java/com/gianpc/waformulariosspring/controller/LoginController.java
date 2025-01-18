package com.gianpc.waformulariosspring.controller;

import com.gianpc.waformulariosspring.model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(Model model) { // enviar el objeto LoginModel desde el controlador hacia la vista
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }
}
