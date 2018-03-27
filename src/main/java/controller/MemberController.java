package controller;

import repository.MemberRepository;

public class MemberController {
	
    private MemberRepository mr;
    
    public MemberController(MemberRepository newMr){    	
    	this.mr =newMr;    	
    }
    
    public void addMember(String name,int memberId) throws Exception {

        mr.addMember(name,memberId);
    }
} 