package ComClass13;

import java.util.Scanner;

public class InterviewQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
System.out.println("Enter your username");
Scanner scanner=new Scanner(System.in);
str=scanner.nextLine();

scanner.close();
String reversed=reverseString(str);
System.out.println("The reversed string is:"+reversed);
	}
	public static String reverseString(String str) {
		
		if(str.isEmpty())
			return str;
		return reverseString(str.substring(1))+str.charAt(0);


	}

		
		
	}


