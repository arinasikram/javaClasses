package ComClass6;

import java.util.Scanner;

public class ScannerSwitch {
	public static void main(String[]args) {
		
		
		String country, foodName;
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country) {
		case "Turkey":
			foodName="Tibs";
			
		break;
		case "Ethiopia":
			foodName="Tibs";
			break;
		case "Mproco":
			foodName="Tajin";
			break;
		case "Kazakhistan":
			foodName="Kumis";
			default:
				foodName="Unknown";
			
			System.out.println("You are from "+country+" and your favourite food is"+foodName);
				
		
		}
		
	}
	
	
}
