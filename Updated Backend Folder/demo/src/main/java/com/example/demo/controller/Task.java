package com.example.demo.controller;

import com.example.demo.model.TaskModel;

import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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


