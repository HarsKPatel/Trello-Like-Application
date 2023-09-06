package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BoardModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Board_id;
    private int Workspace_id;
    private String Board_name;


    public int getBoard_id() {
        return Board_id;
    }

    public void setId(int Board_id) {
        this.Board_id = Board_id;
    }

    public int getWorkspace_id() {
        return Workspace_id;
    }

    public void setWorkspace_id(int Workspace_id) {
        this.Workspace_id= Workspace_id;
    }

    public String getBoard_name() {
        return Board_name;
    }

    public void setUser_password(String Board_name) {
        this.Board_name = Board_name;
    }

    public BoardModel(int Board_id,int Workspace_id,String Board_name ) {
        this.Board_id = Board_id;
        this.Workspace_id = Workspace_id;
        this.Board_name  = Board_name ;

    }

    public BoardModel() {
    }
}
