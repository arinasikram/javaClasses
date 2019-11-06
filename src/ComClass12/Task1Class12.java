package ComClass12;

import java.util.Scanner;

public class Task1Class12{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			
		
		System.out.println("Create your username" );
		String userName=sc.next();
		System.out.println("Create your Password. Passwords must be min. 8 charecters contain.");
		String password=sc.next();
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or passwords can not be empty.Try again");
		}
		else if(password.length()<7) {
			System.out.println("Password is too short. Try again");
		}
		else if(password.contains(userName)) {
			System.out.println("Password cannot contain username. Try again");
		}
		else {
			while(true) {
			System.out.println("Please confirm your passwords");
			String password1=sc.next();
			if(!(password.equals(password1))) {
				System.out.println("Passwords do not match. Try again.");
			}
			else {
				System.out.println("Your username and password has been created.");
				break;
			}}
			break;
		}
	
		}
}

}
