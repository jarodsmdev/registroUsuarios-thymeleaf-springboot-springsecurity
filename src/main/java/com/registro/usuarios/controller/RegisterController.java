package com.registro.usuarios.controller;

import com.registro.usuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("")
    public String homePage(Model model){
        model.addAttribute("users", userService.usersList());
        return "index";
    }
}
