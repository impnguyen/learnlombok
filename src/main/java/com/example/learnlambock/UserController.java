package com.example.learnlambock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.learnlambock.User;

@RestController
@RequestMapping(path = "api")
public class UserController {
    
    @Autowired
	User sessionuser;

    @GetMapping("/user")
    public String getUser(){
        sessionuser.setFirstname("Max");
        sessionuser.setLastname("Mustermann");
        return sessionuser.toString();
    }
}
