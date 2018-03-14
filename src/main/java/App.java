

import java.io.BufferedWriter;
import repository.*;
import controller.*;
import ui.BudgetUI;;

public class App {
	public static void main(String[] args) {
		
			MemberRepository repom = new MemberRepository();
			EntryRepository repoe=new EntryRepository();
		
			MemberController ctrlm = new MemberController(repom);
			EntryController crtle =new EntryController(repoe);
		
			BudgetUI console = new BudgetUI(ctrlm,crtle);
			console.Run();
		
	}
}
