import java.util.Scanner;

public class HomeWork1 {
	
	
	public static void main(String[]args){

		
		Scanner input=new Scanner(System.in);
		System.out.println("Do you have a credit card?true or false");
		boolean cc=input.nextBoolean();
		//input.has
		
		
		if (cc) {
			
			System.out.println("What is the balance on your card?");
			int balance=input.nextInt();
			
			if (balance>100) {
				System.out.println("Please pay off your balance");
			}else {
				System.out.println("You can spend more mone");
			}
			
		}
		
		
		else {
				System.out.println("Would you like to apply for credit card");
				
				
				
			}
		}
		
		
}	
		
		
		
		
	
	
		
		

