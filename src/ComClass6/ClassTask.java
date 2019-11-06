package ComClass6;

import java.util.Scanner;

public class ClassTask {
	
	
	public static void main(String[]args) {

		String month;
		Scanner scan = new Scanner(System.in);
		System.out.println("What month you were born in:");
		month= scan.nextLine();
		String season;
		
		
	if (month.equals("Jan")||month.equals("Feb")||month.equals("Mar")){
		season="Winter";
	}
	else if(month.equals("Apr")|| month.equals("May")||month.equals("June")){
		season="Spring";
	}
	else if(month.equals("Jul")|| month.equals("Aug")|| month.equals("Sep")){
	season="Fall";
	}else if(month.equals("Oct")||month.equals("Nov")||month.equals("Dec")){
		season="Winter";
	}else {
		season="Unknown";
		
	}
		System.out.println("String month" +season);
		System.out.println(month);
	}
		
}
