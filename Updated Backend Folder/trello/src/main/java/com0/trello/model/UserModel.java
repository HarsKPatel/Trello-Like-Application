package com0.trello.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int User_id;
    private String User_email;
    private String User_password;
    private String User_name;


    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }

    public String getUser_email() {
        return User_email;
    }

    public void setUser_email(String User_email) {
        this.User_email= User_email;
    }

    public String getUser_password() {
        return User_password;
    }

    public void setUser_password(String User_password) {
        this.User_password = User_password;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }


    public UserModel(int User_id,int Task_id,String User_email, String User_password, String User_name) {
        this.User_id = User_id;
        this.User_email= User_email;
        this.User_password = User_password;
        this.User_name = User_name;
    }

    public UserModel() {
    }
}

