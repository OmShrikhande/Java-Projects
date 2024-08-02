package jproj;

//import section
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

//main class
public class First {

	public static void main(String[] args) {
		
		
		//objects section
		Scanner sc = new Scanner(System.in);
		Date curdate = new Date();
		SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/YY"); 
		
		//declaration
		String pname,pdes,date, deadline, refs, choice="";
		 final String ANSI_RESET = "\u001B[0m";
		 final String ANSI_BLACK = "\u001B[30m";
		 final String ANSI_RED = "\u001B[31m";
		 final String ANSI_YELLOW = "\u001B[33m";
		 final String ANSI_GREEN = "\u001B[32m";
		 final String ANSI_BLUE = "\u001B[34m";
		 final String ANSI_PURPLE = "\u001B[35m";
		 final String ANSI_CYAN = "\u001B[36m";
		 final String ANSI_WHITE = "\u001B[37m";
		
		//introduction Section
		System.out.println(ANSI_YELLOW+"----------Hii, Any updates-----------\n"+ANSI_RESET);
		
		System.out.println(ANSI_CYAN+"A. New Project");
		System.out.println("B. Update Project");
		System.out.println("C. See list of the projects ");
		System.out.println("D. Delete A Project");
		System.out.println("E. Exit"+ANSI_RESET);
		
		//taking input from user
		System.out.print(ANSI_GREEN+"\n\nEnter any one of the choice: "+ANSI_RESET);
		choice = sc.nextLine();
		
		System.out.println("\n\n---------------------------------------------\n");
		
		//taking input for CRUD operations.
		switch(choice) {
			case "A":
				System.out.print(ANSI_PURPLE+"Enter name of the project: "+ANSI_RESET);
				pname=sc.nextLine();
				
				System.out.print(ANSI_PURPLE+"Enter description of the project: "+ANSI_RESET);
				pname=sc.nextLine();
				
				System.out.println(ANSI_PURPLE+"Date of the project:"+ANSI_RESET+" "+dateformat.format(curdate));
				date=dateformat.format(curdate);
				System.out.print(ANSI_PURPLE+"Enter deadline date of the project(in months): "+ANSI_RESET);
				pname=sc.nextLine();
				
				System.out.println("\n--------------------------------------------------------------------------");
				main(null);
				break;
			case "B":
				System.out.println("What do you want to update the in the project");
				break;
			case "C":
				System.out.println("C. See list of the projects ");
				break;
			case "D":
				System.out.println("D. Delete A Project");
				break;
			case "E":
				System.out.println(ANSI_RED+"EXITED"+ANSI_RESET);
				break;
			default:
				System.out.println(ANSI_RED+"Enter proper choice"+ANSI_RESET);
				break;
		}

	}

}
