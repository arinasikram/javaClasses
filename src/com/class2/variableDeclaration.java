
package com.class2;

;

public class variableDeclaration {

	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 6767;
		long num3 = 78687665675l;
		char num4 = 'A';

//2.declare variable first and then assign value
		int n1;
		int n2;
		int n3;

		n1 = 56;
		n2 = 7676;
		n3 = 767;

//3.declare all variable together and then assign value 
		int number1, number2, number3;

		number1 = 12;
		number2 = 15;
		number3 = 676;

//System.out.println(number3);

		number3 = 1000;
		System.out.println(number3);

		boolean var = true;
		System.out.println(var);

		char myVariable;
		myVariable = '*';
		System.out.println(myVariable);

		number2 = number1;// 12
		System.out.println(number2);

//number2=false;-->compile time error asking to change datatype of 
//variable number2 to boolean
		boolean isRain = false;
		boolean isSnow;
		isSnow = isRain;// isSnow=false;
		System.out.println(isSnow);

		isSnow = true;// changed the vaue of isSnow to true;
		System.out.println(isSnow);

	}

}
