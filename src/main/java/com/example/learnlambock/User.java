package com.example.learnlambock;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class User {
    
    private String firstname;
    private String lastname;
    private LocalDate birthdate;

}
