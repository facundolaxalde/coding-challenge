package com.facundo.controllers;

import com.facundo.services.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {
    
    @Autowired
    PasswordService passwordService;

    @GetMapping("/passwordValid/{pass}") 
    public boolean password(@PathVariable("pass")  String pass){
        return passwordService.isValid(pass);
    }
}
