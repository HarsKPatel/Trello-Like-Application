package com0.trello.service;


import com0.trello.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com0.trello.model.UserModel;


@Service
public class UserService {
    @Autowired
    UserRepository UserRepository;

    public String makeUser(UserModel User) {
        int User_id;
        String User_email;
        String User_password;
        String User_name;

        UserRepository.save(User);
        return"information created properly and successfully for user";
    }
}