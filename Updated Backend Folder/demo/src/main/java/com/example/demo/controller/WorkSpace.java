package com.example.demo.controller;

import com.example.demo.model.WorkSpaceModel;
import com.example.demo.service.WorkspaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/workSpace")
public class WorkSpace {

    @Autowired
    WorkspaceService WorkSpaceService;
    @PostMapping("/save")
    public String createUser(@RequestBody WorkSpaceModel workSpace){
        return WorkSpaceService.makeWorkSpace(workSpace);
    }
}
