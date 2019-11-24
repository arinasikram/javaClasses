package ComClass04;

import java.util.Scanner;

public class BetterCalculateor {
	
	public static void main(String[] args) {
		
		
//		int a=10;
//		int b=12;
//		String name1="John";
//		String name2="John";
//		
//		System.out.println(name1.equals(name2));
//		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("Enter in First Number:");
		int num1=scan.nextInt();
		
		
		System.out.print("Enter in Second Number:");
		int num2=scan.nextInt();
		
		System.out.print("Enter Operator:");
		String operator=scan.next();
		
		if(operator.equals("+")) {
			
			System.out.println(num1+num2);
		}else if(operator.equals("-")) {
			
			System.out.println(num1-num2);
		} else if (operator.equals("/")) {
			System.out.println(num1/num2);
		} else if(operator.equals("*")) {
			System.out.println(num1*num2);
			
		} else {	
			System.out.println("Invalid Operator or number entered");	
		}
	}}
			
			

