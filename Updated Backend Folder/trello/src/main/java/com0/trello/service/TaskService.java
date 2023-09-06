package com0.trello.service;

import com0.trello.model.TaskModel;
import com0.trello.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {
    @Autowired
    TaskRepository TaskRepository;

    public String makeTask(TaskModel Task) {
        int Board_id;
        int Task_id;
        String Start_Date;
        String End_Date;
        String Task_name;
        String Work_status;

        TaskRepository.save(Task);
        return"information created properly and successfully for task";
    }
}