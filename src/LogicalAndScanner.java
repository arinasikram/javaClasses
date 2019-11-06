import java.util.Scanner;

public class LogicalAndScanner {
	
	public static void main(String[]args) {
		

		
		int age;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter you age");
		age=scan.nextInt();
		
		if(age>=1&& age <=3) {
			System.out.println("You are a baby");
			
		}else if (age>3&& age <=5) {
			
			System.out.println("You are toddler");
		}else if (age>5 && age <=12) {
			System.out.println("You are kid");
			
		}
		
	
		
			
			
			
		
		

		
			
			
		}
	}


