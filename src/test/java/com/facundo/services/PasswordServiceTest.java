package com.facundo.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class PasswordServiceTest {
    
    @Autowired
    PasswordService passwordService;
    
    @Test
    public void testEmtyPass() {
        String pass = new String();
        boolean response = passwordService.isValid(pass);
        Assert.isTrue(!response);
    }
    
    @Test
    public void shortestValidPass() {
        String pass = "12345";
        boolean response = passwordService.isValid(pass);
        Assert.isTrue(response);
    }
    
    @Test
    public void longValidPass() {
        String pass = "1234567890";
        boolean response = passwordService.isValid(pass);
        Assert.isTrue(response);
    }
    
    @Test
    public void longInvalidPass() {
        String pass = "12345678901";
        boolean response = passwordService.isValid(pass);
        Assert.isTrue(!response);
    }
    
    @Test
    public void shortInvalidPass() {
        String pass = "1234";
        boolean response = passwordService.isValid(pass);
        Assert.isTrue(!response);
    }

    @Test
    public void validPass() {
        String pass = "1234567";
        boolean response = passwordService.isValid(pass);
        Assert.isTrue(response);
    }
}
