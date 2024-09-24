package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private static final int USER_ID = 12345;
    
    @GetMapping("/api/v1/user")
    public UserResponse getUser() {
        return new UserResponse(USER_ID);
    
    }

    public static class UserResponse{
        private int user_id;
        
        public UserResponse(int user_id){
            this.user_id = user_id;
        }

        public int getUser_id(){
            return user_id;
        }
    }
}