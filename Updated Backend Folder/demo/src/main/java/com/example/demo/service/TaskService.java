package com.example.demo.service;

import com.example.demo.model.TaskModel;
import com.example.demo.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public String makeTask(TaskModel Task) {
        int Board_id;
        int Task_id;
        String Start_Date;
        String End_Date;
        String Task_name;
        String Work_status;

        taskRepository.save(Task);
        return"information created properly and successfully for task";
    }
}