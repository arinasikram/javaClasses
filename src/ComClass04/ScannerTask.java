package ComClass04;

import java.util.Scanner;

public class ScannerTask {
	public static void main(String[]args) {
		
		Scanner keyboard=new Scanner(System.in);
		
		
		System.out.println("please enter temperature");
		
		int temp=keyboard.nextInt(); 
		
		System.out.println("please enter city");
		
		String cityName=keyboard.nextLine();
		
		int convertedTemp=(temp-32)*5/9;
		
		
		System.out.println("The temperature in city " +cityName+ "is"+convertedTemp);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
