package controller;

import model.Member;
import repository.MemberRepository;

import java.util.List;

public class MemberController {
	
    private MemberRepository mr;
    
    public MemberController(MemberRepository newMr){    	
    	this.mr =newMr;    	
    }
    
    public void addMember(String name,int memberId) throws Exception {

        mr.addMember(name,memberId);
    }

    public List<Member> getAll(){return mr.getAll();}
} 