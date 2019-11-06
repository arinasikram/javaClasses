package Class7;

import java.util.Scanner;

public class Homework {
	public static void main (String[]args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct number");
		
		
		double no1 =scan.nextDouble();
		double no2 =scan.nextDouble();
		double no3 =scan.nextDouble();
		
		
		if (no1 > no2) {
			
			if (no1>no3) {
				System.out.println("largest number is first_"+no1);
			}else {
				System.out.println("Largest number is third_"+no3);
			}
				
			}else {
				if (no2 >no3) {
					System.out.println("Largest number is second_"+no2);
				}else {
					System.out.println("Largest number is third_"+no3);
				
				
			}
		}
		
		
	}

}
