package Comclass8;

import java.util.Scanner;

public class Task3 {
	public static void main (String[]args) {
		
		// task
		for( int b=1; b<=50; b++) {
			if (b%3==0) 
		continue;
		
		System.out.println(b);
		
			}
		//task2
			String card;
			Scanner scan=new Scanner(System.in);
			for(int i=1; i<=10;i++) {
				System.out.println("Apply for a credit card");
				 card=scan.next();
				if(card.contentEquals("Yes")) {
						
						break;
						
				}					
			}			}			
			
	}
		
