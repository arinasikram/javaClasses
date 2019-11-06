package Comclass8;

public class Task2 {
	public static void main(String[]args) {
		
		int total=20;
		
	for	(int i=0; i<20; i+=6){
		
		System.out.println(total);
			total=total+i;
		}
	int total1=20;
	for (int i=0; i>20; i+=7) {
		System.out.println(total1);
	}
	
	int sumEven=0;
	int sumOdd=0;
	for (int i=1; i<=20; i++) {
		if (i%2==0) {
			System.out.println(i);
			sumEven=sumEven+1;
		}else { 
			sumOdd=sumOdd+i;
			
		}
		System.out.println("The total of all even#="+sumEven);
		System.out.println("The total of all odd#="+sumOdd);
	}
		
	}
		
		
		
	}


