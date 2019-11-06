package ComClass13;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner=new Scanner (System.in);
		System.out.println("Enter your class day::");
		String day=scanner.nextLine();
		
		if(day.contentEquals("Saturday")) {
			
			
			System.out.println("Sturday is your Java class");
			
		}else if(day.contentEquals("Sunday")) {
			System.out.println("Sunday is your Git class");
		}else if(day.equals("Tuesday")) {
			System.out.println("Tuesday is our SDLC class");
		}else if(day.equals("thursday")) {
			System.out.println("Tuesday is our Mnual Testing class");
		}else {
			System.out.println("Envalid Entry!! Please enter a valid day");
			
		}
		scanner.close();

	}

}
