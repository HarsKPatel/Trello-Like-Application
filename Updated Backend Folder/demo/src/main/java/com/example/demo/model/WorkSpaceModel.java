package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WorkSpaceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int WorkSpace_id;
    private int User_id;
    private String WorkSpace_name;
    private String WorkSpace_details;


    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }

    public int getWorkSpace_id() {
        return WorkSpace_id;
    }

    public void setWorkSpace_id(int WorkSpace_id) {
        this.WorkSpace_id= WorkSpace_id;
    }

    public String getWorkSpace_name() {
        return WorkSpace_name;
    }

    public void setWorkSpace_name(String WorkSpace_name) {
        this.WorkSpace_name = WorkSpace_name;
    }

    public String getWorkSpace_details() {
        return WorkSpace_details;
    }

    public void setWorkSpace_details(String WorkSpace_details) {
        this.WorkSpace_details = WorkSpace_details;
    }


    public WorkSpaceModel(int User_id,int WorkSpace_id,String WorkSpace_name, String WorkSpace_details) {
        this.User_id = User_id;
        this.WorkSpace_id= WorkSpace_id;
        this.WorkSpace_name = WorkSpace_name;
        this.WorkSpace_details = WorkSpace_details;

    }

    public WorkSpaceModel() {
    }
}



