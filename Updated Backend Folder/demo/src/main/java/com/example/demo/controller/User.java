package com.example.demo.controller;


import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    UserService userService;
    @PostMapping("/save")
    public String createUser(@RequestBody UserModel user){
        return userService.makeUser(user);
    }
}