package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int Member_id;
    private int Board_id;
    private int Task_id;
    private int Workspace_id;
    private String Member_name;
    private String Member_email;


    public int getMember_id() {
        return Member_id;
    }

    public void setMember_id(int Member_id) {
        this.Member_id = Member_id;
    }

    public int getWorkspace_id() {
        return Workspace_id;
    }

    public void setWorkspace_id(int Workspace_id) {
        this.Workspace_id= Workspace_id;
    }

    public int getBoard_id() {
        return Board_id;
    }

    public void setBoard_id(int Board_id) {
        this.Board_id = Board_id;
    }

    public int getTask_id() {
        return Task_id;
    }

    public void setTask_id(int Task_id) {
        this.Task_id = Task_id;
    }


    public String getMember_email() {
        return Member_email;
    }

    public void setMember_email(String Member_email) {
        this.Member_email = Member_email;
    }


    public String getMember_name() {
        return Member_name;
    }

    public void setMember_name(String Member_name) {
        this.Member_name = Member_name;
    }

    public MemberModel(int Board_id,int Workspace_id,String Board_name ) {
        this.Board_id = Board_id;
        this.Workspace_id = Workspace_id;
        this.Member_id  = Member_id;
        this.Task_id=Task_id;
        this.Member_name=Member_name;
        this.Member_email=Member_email;

    }

    public MemberModel() {
    }
}
