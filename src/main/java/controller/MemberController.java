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

        if(name==null)
            throw new Exception("Invalid name");
        if(memberId<0)
            throw new Exception("id out of range!");
        if(name.length()<2)
            throw  new Exception("name to short!");
        if(name.length()>255)
            throw  new Exception("name to long!");
        boolean word=false;
        for (char c : name.toCharArray()) {
            if(!word && !Character.isUpperCase(c))
                throw new Exception("names should start with uppercase!");
            else
                if(c==' '||c=='-')
                word=false;
            else
                if(Character.isDigit(c))
                    throw new Exception("names do not contain numbers!");
            else
                if(Character.isUpperCase(c)&&word)
                    throw new Exception("no uppercase inside names!");
            else
                if(Character.isAlphabetic(c)) {
                    if (Character.isUpperCase(c))
                        word = true;
                    continue;
                }
            throw new Exception("no simbols inside name!");
        }
        List<Member> all=mr.getAll();
        for(int i=0;i<all.size();i++)
            if(memberId==all.get(i).getId())
                throw new Exception("id already exists!");

        mr.addMember(name,memberId);
    }
} 