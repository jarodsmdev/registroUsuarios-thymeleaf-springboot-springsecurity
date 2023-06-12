package com.registro.usuarios.service;

import com.registro.usuarios.DTO.UserRegistrationDTO;
import com.registro.usuarios.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    public User save(UserRegistrationDTO registrationDTO);
    public List<User>usersList();
}
