package controller;
import model.Entry;
import repository.EntryRepository;

import java.util.List;

public class EntryController {
	
    private EntryRepository er;
    
    public EntryController(EntryRepository newEr){    	
    	this.er =newEr;    	
    }
    
    public void addEntry(String type,int value,int memberId) {
        er.addEntry(type,value,memberId);    	
    }

     public List<Entry>  allEntriesForMember(int memberId) {
        
    	
        List<Entry> allE= this.er.allEntriesForMember(memberId);
        return allE;
    }
} 
