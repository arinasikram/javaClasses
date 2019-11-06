package Class7;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[]args) {
		
	
	
	
	/* you need to ask user to pay for coffee
	 * You need to keep asking user to pay for it until
	 * entered price is equal=5;
	 * After user paid then say"Enjoy your coffee!"
	 * 
	 */
	Scanner pay=new Scanner(System.in);
	
	int coffee=1;
	
	do {
		System.out.println("Please pay for coffee");
		coffee=pay.nextInt()
		;
		
	}
	while(coffee!=5);{
		System.out.println("Enjoy your coffee");
	
	}	
		
}

}
