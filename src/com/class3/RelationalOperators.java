package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 19;

		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println("***************");

		double d = 11.99;
		double d1 = 2.99;

		boolean b = d > d1;
		System.out.println(b);// false

		boolean b1 = d < d;
		boolean b2 = d == d1;
		boolean b3 = d != d1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		int a = 203;
		int c = 30;
		// if number a is bigger than b
		// I want to print a is larger than b

		if (a > c) {
			System.out.println("a is larger than b");

		} else {
			System.out.println("a is smaller than b");
		}

		int expectedHours = 15;
		int actualHours = 2;

		// if expected hours are more than actual-> you will succeed
		// otherwise please study more

		if (actualHours > expectedHours) {
			System.out.println("you will succeed");
		} else {
			System.out.println("please study more");
		}
		double teaPrice = 4.99;
		double allowedPrice = 3.99;
		teaPrice = 2;
		// if price is more than i can afford I will not buy
		// if price is less or matches what I can afford then I will buy tea

		if (allowedPrice >= teaPrice) {

			System.out.println(" I will buy tea");
			System.out.println("And I will enjoy my tea");
		} else {

			System.out.println("I canot afford,I need to study more");

			System.out.println("I will go back to study more");

		}

		System.out.println("I keep writting some code");
		System.out.println("I keep writting more code");

	}

}
