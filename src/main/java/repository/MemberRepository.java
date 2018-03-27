package repository;

import model.Member;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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
		 List<Member> all=getAll();
		 for(int i=0;i<all.size();i++)
			 if(memberId==all.get(i).getId())
				 throw new Exception("id already exists!");

		members.add(new Member(name,memberId));
	 }
	 public List<Member> getAll(){return members;}
}
