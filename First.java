package jproj;

//import section
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import jproj.Concolrs;

//main class
public class First {

	public static void main(String[] args) {
		
		
		//objects section
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/YY");
			
		
		//objs of self created classes
			Concolrs col =new Concolrs();
			CRUDproj nwprj = new CRUDproj();
		//declaration
			String pname,pdes,date, deadline, refs, choice="";
		 
		
		//introduction Section
			System.out.println(col.ANSI_YELLOW+"----------Hii, Any updates-----------\n"+col.ANSI_RESET);
			
			System.out.println(col.ANSI_CYAN+"A. New Project");
			System.out.println("B. Update Project");
			System.out.println("C. See list of the projects ");
			System.out.println("D. Delete A Project");
			System.out.println("E. Exit"+col.ANSI_RESET);
			
			//taking input from user
				System.out.print(col.ANSI_GREEN+"\n\nEnter any one of the choice: "+col.ANSI_RESET);
				choice = sc.nextLine();
				
				System.out.println("\n\n-------------------------------------\n");
			
			//taking input for CRUD operations.
				switch(choice.toUpperCase()) {
					case "A":
								nwprj.Createproj();
								main(null);
								break;
					case "B":
								nwprj.Updateproj();
								main(null);
								break;
					case "C":
								nwprj.Lookproj();
								main(null);
								break;
					case "D":
								nwprj.Delproj();
								main(null);
								break;
					case "E":
								System.out.println(col.ANSI_RED+"EXITED"+col.ANSI_RESET);
								break;
					default:
								System.out.println(col.ANSI_RED+"Enter proper choice"+col.ANSI_RESET);
								main(null);
								break;
				}

	}

}

class CRUDproj{
	//declaration
	String pname,pdes,date, deadline, refs, choice="",choices;
	
	//imports
	Scanner sc = new Scanner(System.in);
	Date curdate = new Date();
	SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/YY"); 
	Concolrs col =new Concolrs();
	
	 public void Createproj() {
		
	System.out.print(col.ANSI_PURPLE+"Enter name of the project: "+col.ANSI_RESET);
	pname=sc.nextLine();
	
	System.out.print(col.ANSI_PURPLE+"Enter description of the project: "+col.ANSI_RESET);
	pname=sc.nextLine();
	
	System.out.println(col.ANSI_PURPLE+"Date of the project:"+col.ANSI_RESET+" "+dateformat.format(curdate));
	date=dateformat.format(curdate);
	System.out.print(col.ANSI_PURPLE+"Enter deadline date of the project(in months): "+col.ANSI_RESET);
	pname=sc.nextLine();
	
	System.out.println("\n-------------------------------------");
	 }
	 
	 //to update any project information
	 public void Updateproj() {
		 
		 
		 	
		 
			//Giving choices for updation
			System.out.println(col.ANSI_YELLOW+"What do you want to upate?? "+col.ANSI_RESET);
			System.out.println(col.ANSI_PURPLE+"A. Project name ");
			System.out.println("B. Project Description ");
			System.out.println("C. Deadline ");
			System.out.println("D. Project Refrences");
			System.out.println("E. Project List"+col.ANSI_RESET);
			
			
			
			System.out.print(col.ANSI_GREEN+"\n\nEnter any one of the choice: "+col.ANSI_RESET);
			choices = sc.nextLine();
			
			switch(choices.toUpperCase()) {
			case "A":
				System.out.println("Enter new Project name: ");
				pname = sc.nextLine();
				break;
			case "B":
				System.out.println("Enter new Description: ");
				pdes = sc.nextLine();
				break;
			case "C":
				System.out.println("Enter new Deadline: ");
				deadline = sc.nextLine();
				break;
			case "D":
				System.out.println("Enter new Refrences: ");
				refs = sc.nextLine();
				break;
			case "E":
				Lookproj();
				break;
				
			default:
				System.out.println("Enter proper choice");
				break;
			}
			
		
			
			System.out.println("\n-------------------------------------");
			 
	 }
	 
	 //to see the projects that i have 
	 public void Lookproj() {
		 System.out.println("Under Devlopment");
	 }
	 
	 //to delete any project
	 public void Delproj() {
		 System.out.println("Under Devlopment");
		 
	 }
}
