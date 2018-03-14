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

public class MemberRepository {
	private List<Member> members = new ArrayList<Member>();

	private final static String filenameMember = "membersF.txt";

	@SuppressWarnings("resource")
	public MemberRepository() {
		
	try{
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String currentLine = null;

		fileReader = new FileReader(filenameMember);
		bufferedReader = new BufferedReader(fileReader);
		
		while ((currentLine = bufferedReader.readLine()) != null) {
			String line[] = currentLine.split(";");
			int id=Integer.parseInt(line[0]);
			Member m = new Member(line[1], id);
			this.members.add(m);			
		}
	 }catch(Exception ex){
         System.err.println(ex.getMessage());
     }
	}

	 public void addMember(String name,int memberId){
		 members.add(new Member(name,memberId));		 	 
	 }
}
