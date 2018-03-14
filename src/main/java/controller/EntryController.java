package controller;
import repository.EntryRepository;

import model.Member;
import model.Entry;



import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EntryController {
	
    private EntryRepository er;
    
    public EntryController(EntryRepository newEr){    	
    	this.er =newEr;    	
    }
    
    public void addEntry(String type,int value,int memberId) {
        er.addEntry(type,value,memberId);    	
    }

     public List<Entry>  allEntriesForMember(int memberId) {
        
    	
        List<Entry> allE= new ArrayList<>();
        allE = this.er.allEntriesForMember(memberId);
        return allE;
    }
} 
