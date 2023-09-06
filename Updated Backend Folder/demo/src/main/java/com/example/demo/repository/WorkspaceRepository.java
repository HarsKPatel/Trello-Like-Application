package com.example.demo.repository;


import com.example.demo.model.WorkSpaceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkspaceRepository extends JpaRepository<WorkSpaceModel,Integer> {
}
