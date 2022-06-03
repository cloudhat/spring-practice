package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberCountroller {
    private final MemberService memberService;

    @Autowired
    public MemberCountroller(MemberService memberService){
        this.memberService = memberService;
    }


}
