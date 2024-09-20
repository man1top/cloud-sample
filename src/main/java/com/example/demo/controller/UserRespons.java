package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private static final int USER_ID = 12345

    
    @GetMapping("/api/v1/user")
    public UserResponse getUser() {
        return new UserRespones(USER_ID);
    }
}
