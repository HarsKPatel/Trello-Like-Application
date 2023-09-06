package com0.trello.controller;

import com0.trello.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com0.trello.model.TaskModel;


@RestController
@RequestMapping("/task")
public class Task {

    @Autowired
    TaskService taskService;
    @PostMapping("/save")
    public String createTask(@RequestBody TaskModel task){
        return taskService.makeTask(task);
    }
}


