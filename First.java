package jproj;

//import section
import java.util.Scanner; 
import java.util.Date;
import java.text.SimpleDateFormat;
import jproj.Concolrs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

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
	pdes=sc.nextLine();
	
	System.out.println(col.ANSI_PURPLE+"Date of the project:"+col.ANSI_RESET+" "+dateformat.format(curdate));
	date=dateformat.format(curdate);
	
	System.out.print(col.ANSI_PURPLE+"Enter deadline date of the project(in months): "+col.ANSI_RESET);
	deadline=sc.nextLine();
	
	System.out.print(col.ANSI_PURPLE+"Enter refrences for the project: "+col.ANSI_RESET);
	refs=sc.nextLine();
	
	System.out.println("\n-------------------------------------");
	
	WriteInfo(pname, pdes, date, deadline, refs);
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
		 
		 try{
			 File myproj = new File(Concolrs.FileName);
			 FileReader filereader = new FileReader(myproj);
			 
			 BufferedReader reader = new BufferedReader(filereader);
			 
			 String line = null;
			 
			 while((line =reader.readLine())!= null) {
				 System.out.println(line);
			 }
			 
			 reader.close();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
	 
	 //to delete any project
	 public void Delproj() {
		  Scanner scanner = new Scanner(System.in);

	        // Get the current directory
	        String currentDirectoryPath = System.getProperty("user.dir");
	        File currentDirectory = new File(currentDirectoryPath);

	        System.out.print("Enter the file name to search and delete: ");
	        String fileName = scanner.nextLine();

	        File fileToDelete = new File(currentDirectory, fileName);
	        if (!fileToDelete.exists() || !fileToDelete.isFile()) {
	            System.out.println("File not found.");
	            return;
	        }

	        System.out.print("Are you sure you want to delete this file? (yes/no): ");
	        String confirmation = scanner.nextLine();
	        if (confirmation.equalsIgnoreCase("yes")) {
	            if (fileToDelete.delete()) {
	                System.out.println("File deleted successfully.");
	            } else {
	                System.out.println("Failed to delete the file.");
	            }
	        } else {
	            System.out.println("File deletion cancelled.");
	        }

	        // List remaining files in the current directory in red color
	        File[] files = currentDirectory.listFiles();
	        if (files != null) {
	            System.out.println("Remaining files in the directory:");
	            for (File file : files) {
	                if (file.isFile()) {
	                    System.out.println("\033[31m" + file.getName() + "\033[0m");
	                }
	            }
	        } else {
	            System.out.println("Failed to list files in the directory.");
	        }
		 
	 }
	 
	 //to write content in the file 
	 
	 public void WriteInfo(String pname, String pdes, String date, String deadline, String refs) {
		 try {
			 File file = new File(Concolrs.FileName);
			 FileWriter fw = new FileWriter(Concolrs.FileName);
			 fw.write("Project name: "+pname+"\nProject Description: "+pdes+"\nStarting Date: "+date+"\nDeadline of project "+pname+" :"+deadline+"\nRefrences for the Project: "+refs);
			 fw.close();
			 
			 System.out.println("Information added to: "+file.getAbsolutePath());
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
	 
	 
}
