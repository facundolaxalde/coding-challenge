package com.facundo.services;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    public static int MIN = 5;
    public static int MAX = 10;

    public boolean isValid(String password) {
        if (StringUtils.isEmpty(password)) {
            return false;
        }
        if (password.length() > MAX || password.length() < MIN ) {
            return false;
        }
        return true;
    }
}
