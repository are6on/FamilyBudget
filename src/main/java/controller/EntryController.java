package controller;
import model.Entry;
import model.Member;
import repository.EntryRepository;
import repository.MemberRepository;

import java.util.List;

public class EntryController {
	
    private EntryRepository er;
    private MemberRepository erm;
    
    public EntryController(EntryRepository newEr, MemberRepository erm){
    	this.er =newEr;
        this.erm = erm;
    }
    
    public void addEntry(String type,int valueInt,int idInt) throws Exception {

        if (!type.equals("income") && !type.equals("cost"))
            throw new Exception("\"" + type + "\" incorect!\n Type should be either income or cost.");

        if (valueInt <= 0)
            throw new Exception("value should be positiv and nonzero!");

        boolean found = false;
        for (Member e : erm.getAll())
            if (e.getId() == idInt) {
                found = true;
                break;
            }
        if (!found)
            throw new Exception("Member not found!");
        er.addEntry(type, valueInt, idInt);
    }

     public List<Entry>  allEntriesForMember(int memberId) {
        
    	
        List<Entry> allE= this.er.allEntriesForMember(memberId);
        return allE;
    }
} 
