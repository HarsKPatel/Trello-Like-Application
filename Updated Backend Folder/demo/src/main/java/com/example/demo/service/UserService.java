package com.example.demo.service;


import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String makeUser(UserModel user) {
        int User_id;
        String User_email;
        String User_password;
        String User_name;

        userRepository.save(user);
        return"information created properly and successfully for user";
    }
}