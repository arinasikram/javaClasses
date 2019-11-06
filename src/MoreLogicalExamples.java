import java.util.Scanner;

public class MoreLogicalExamples {
	// to immport short cut id ctrl=+shift+o
	public static void main(String[]args) {
		
		
		Scanner scan;
		double  salesAmount;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		salesAmount=scan.nextDouble();
		
		if ( salesAmount<100) {
			
			commission=salesAmount*0.1;
			
		}else if (salesAmount>=100 && salesAmount<200) {
			
			commission=salesAmount*0.2;
			
		}else if(salesAmount>=200 && salesAmount<500) {
			
		}
		
		
		
		
		
		
	}

}
