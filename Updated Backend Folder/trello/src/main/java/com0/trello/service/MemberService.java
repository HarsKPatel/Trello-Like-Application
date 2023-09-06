package com0.trello.service;


import com0.trello.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com0.trello.model.MemberModel;


@Service
public class MemberService {
    @Autowired
    MemberRepository MemberRepository;

    public String makeMember(MemberModel Member) {
        int Board_id;
        int Workspace_id;
        int Member_id;
        int Task_id;
        String Member_name;
        String Member_email;
        MemberRepository.save(Member);
        return"information created properly and successfully for member";
    }
}
