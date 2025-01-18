package com.gianpc.waformulariosspring.controller;

import com.gianpc.waformulariosspring.model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(Model model) { // enviar el objeto LoginModel desde el controlador hacia la vista
        model.addAttribute("loginModel", new LoginModel());
        model.addAttribute("mostrarMensaje", false);
        return "login";
    }

    @PostMapping("/login")
    public String validarLogin(@ModelAttribute("loginModel") LoginModel loginModel,
                               Model model){
        if(loginModel.getUsuario().equals("gian") &&
                loginModel.getPassword().equals("123")){
            model.addAttribute("mensaje", "Bienvenido "
                    + loginModel.getUsuario());
            return "home";
        }
        model.addAttribute("mostrarMensaje", true);
        model.addAttribute("mensaje",
                "Usuario o contraseña incorrectos");
        return "login";
    }
}
