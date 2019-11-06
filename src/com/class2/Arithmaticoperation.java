package com.class2;

public class Arithmaticoperation {

	
	/*
	*declare 2 variables and initialize them
	*perform addition,subtraction,multiplication and division
	*
	*/
	
	public static void main(String[] args) {

		int num1, num2;
		
		num1=10;
		num2=20;

//		System.out.println(num1 + num2); // 30
//		System.out.println(num1 - num2); // 10
//		System.out.println(num1 * num2); // 200

		// how can we print value of num1 and num 2 togerther

		System.out.println(num1 + " " + 2);
		int sum = num1 + num2;
	
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		// the addition of 2 numbers is _
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);

	}

}
