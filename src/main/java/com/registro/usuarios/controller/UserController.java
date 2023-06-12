package com.registro.usuarios.controller;

import com.registro.usuarios.DTO.UserRegistrationDTO;
import com.registro.usuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class UserController {

    @Autowired
    private UserService userService;

//    @ModelAttribute("user")
//    public UserRegistrationDTO returnNewUserRegistrationDTO(){
//        return new UserRegistrationDTO();
//    }

    @GetMapping
    public String showFormRegister(Model model){
        model.addAttribute("user", new UserRegistrationDTO());
        return "register";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") UserRegistrationDTO userRegistrationDTO){
        userService.save(userRegistrationDTO);
        return "redirect:/register?success";
    }
}
