package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;
import controller.*;

public class BudgetUI {
	private MemberController ctrlm;
	private EntryController  ctrle;
	Scanner in;
	
	public BudgetUI(MemberController ctrlm,EntryController ctrle)
	{
		this.ctrlm=ctrlm;
		this.ctrle=ctrle;
		this.in=new Scanner(System.in);
	}
	
	public MemberController getCtrlm()
	{
		return this.ctrlm;
	}

	public EntryController getCtrle()
	{
		return this.ctrle;
	}
	
	public Scanner getIn()
	{
		return this.in;
	}
	
	public void setCtrlm(MemberController newCtrl)
	{
		this.ctrlm=newCtrl;
	}
	
	public void setCtrle(EntryController newCtrl)
	{
		this.ctrle=newCtrl;
	}
	
	public void setIn(Scanner newIn)
	{
		this.in=newIn;
	}
	
	public void printMenu()
	{
		String menu;
		menu="Budget Admin Menu: \n";
		menu +="\t 1 - to add a new member; \n";
		menu +="\t 2 - to add a new income/cost; \n";
		menu +="\t 3 - to list the current income/cost for a member; \n";
		menu +="\t 0 - exit \n";
		
		System.out.println(menu);
	}
	
	
	public void Run()
	{
		printMenu();
	
		
		int cmd=in.nextInt();
		in.nextLine();
		
		while(cmd!=0)
		{
			if(cmd==1)
			{								
				System.out.println("Enter name:");
				String name = in.nextLine();
				System.out.println("Enter id:");
				int id = Integer.parseInt(in.nextLine());
				ctrlm.addMember(name,id);		
				
			}
			if(cmd==2)
			{
				
				
				System.out.println("Enter type:");
				String type = in.nextLine();
				
				System.out.println("Enter the value:");
				String valueS = in.nextLine();
				int valueInt=Integer.parseInt(valueS);
				
				System.out.println("Enter the id of the member:");
				String idS = in.nextLine();
				int idInt=Integer.parseInt(idS);
						
				ctrle.addEntry(type,valueInt,idInt);
			    
			}
			if(cmd==3)
			{
				System.out.println("Enter the id of the member:");
				String idS = in.nextLine();
				int idInt=Integer.parseInt(idS);
				
				System.out.println("list the current budget :");
				
				List<Entry> allE= ctrle.allEntriesForMember(idInt);
				for (int j=0;j<allE.size();j++)
					System.out.println(allE.get(j).toString());				
			}

			printMenu();
			cmd=in.nextInt();
			in.nextLine();
		}
	}
}

