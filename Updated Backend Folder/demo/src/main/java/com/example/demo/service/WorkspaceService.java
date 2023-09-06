package com.example.demo.service;


import com.example.demo.model.WorkSpaceModel;
import com.example.demo.repository.WorkspaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class WorkspaceService {
    @Autowired
    WorkspaceRepository workspaceRepository;

    public String makeWorkSpace(WorkSpaceModel WorkSpace) {

        workspaceRepository.save(WorkSpace);
        return"information created properly and successfully for workspace";
    }
}