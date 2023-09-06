package com.example.demo.service;


import com.example.demo.model.MemberModel;

import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public String makeMember(MemberModel member) {

        memberRepository.save(member);
        return"information created properly and successfully for member";
    }
}
