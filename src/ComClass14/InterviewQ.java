package ComClass14;

import java.util.Scanner;

public class InterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner (System.in);
		int x=10;
		int y=20;
	
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
		
		 String str1="Hello";
       String str2="Bye";
        System.out.println(str1.replaceAll(str1, str2));
        System.out.println(str2.replaceAll(str2, str1));
        System.out.println("================================");
	}

}
