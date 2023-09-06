
package com0.trello.controller;

        import com0.trello.service.MemberService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;
        import com0.trello.model.MemberModel;


@RestController
@RequestMapping("/member")
public class Member {

    @Autowired
    MemberService memberService;
    @PostMapping("/save")
    public String createMember(@RequestBody MemberModel member){
        return memberService.makeMember(member);
    }
}

