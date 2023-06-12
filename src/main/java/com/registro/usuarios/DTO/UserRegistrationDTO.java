package com.registro.usuarios.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class UserRegistrationDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;

    public UserRegistrationDTO(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public UserRegistrationDTO(String email) {
        this.email = email;
    }
}
