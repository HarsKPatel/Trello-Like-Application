package com0.trello.service;


import com0.trello.repository.WorkspaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com0.trello.model.WorkSpaceModel;


@Service
public class WorkspaceService {
    @Autowired
    WorkspaceRepository WorkspaceRepository;

    public String makeWorkSpace(WorkSpaceModel WorkSpace) {
        int WorkSpace_id;
        int User_id;
        String WorkSpace_name;
        String WorkSpace_details;

        WorkspaceRepository.save(WorkSpace);
        return"information created properly and successfully for workspace";
    }
}