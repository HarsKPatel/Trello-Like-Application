package com0.trello.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int Board_id;
    private int Task_id;
    private String Start_Date;
    private String End_Date;
    private String Task_name;
    private String Work_status;


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
        this.Task_id= Task_id;
    }

    public String getTask_name() {
        return Task_name;
    }

    public void setTask_name(String Task_name) {
        this.Task_name = Task_name;
    }

    public String getWork_status() {
        return Work_status;
    }

    public void setWork_status(String Work_status) {
        this.Work_status = Work_status;
    }


    public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String Start_Date) {
        this.Start_Date = Start_Date;
    }


    public String getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(String End_Date) {
        this.End_Date = End_Date;
    }

    public TaskModel(int Board_id,int Task_id,String Work_status, String Task_name, String Start_Date, String End_Date) {
        this.Board_id = Board_id;
        this.Task_id=Task_id;
        this.Work_status = Work_status;
        this.Task_name = Task_name;
        this.Start_Date = Start_Date;
        this.End_Date = End_Date;
    }

    public TaskModel() {
    }
}

