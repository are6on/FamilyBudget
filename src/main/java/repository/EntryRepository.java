package repository;

import java.io.BufferedReader;

import model.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import exceptions.InvalidBudgetException;
import exceptions.InvalidNameException;
import exceptions.InvalidTypeException;

public class EntryRepository {
	private List<Entry> entries = new ArrayList<Entry>();
	
	private final static String filenameBudget = "budgetF.txt";
	
	@SuppressWarnings("resource")
	public EntryRepository() {
		try{
			FileReader fileReaderEntry = null;
			BufferedReader bufferedReaderEntry = null;
			String currentLineEntry = null;

			fileReaderEntry = new FileReader(filenameBudget);
			bufferedReaderEntry = new BufferedReader(fileReaderEntry);
			
			while ((currentLineEntry = bufferedReaderEntry.readLine()) != null) {
				String line[] = currentLineEntry.split(";");
				int valueEntry = Integer.parseInt(line[1]);
				int idEntryMember = Integer.parseInt(line[2]);
				Entry e = new Entry(line[0],valueEntry,idEntryMember);
				this.entries.add(e);			
			}
		 }catch(Exception ex){
	         System.err.println(ex.getMessage());
	     }
	}
	public void addEntry(String type,int value,int memberId){
		 entries.add(new Entry(type,value,memberId));		 	 
	 }
	 public List<Entry> getAllEntries(){
		 return entries;
	 }
	 public List<Entry> allEntriesForMember(int memberId){
		 List<Entry> allE= new ArrayList<>();
		 for(Entry e:entries)
			 if(e.getIdMember()==memberId)
				 allE.add(e);
		 return allE;
	 }
}
