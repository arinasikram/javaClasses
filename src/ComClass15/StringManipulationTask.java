package ComClass15;

import java.util.Scanner;

public class StringManipulationTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lets ask user to enter browser
		// based on input we say "Your selected browser is"-------------

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter browser name");

		String browser = scan.nextLine();

		switch (browser) {
		case "firefax":
			System.out.println("Execution be performed on" + browser);
			break;
		case "Chrome":
			System.out.println("Execution be performed on" + browser);
			break;
		case "ie":
			System.out.println("Execution be performed on" + browser);
			break;
		case"safari":
			System.out.println("Execution be performed on" + browser);
			break;
			default:
				System.out.println("Please enter valid browser");

			

		}

	}

}
