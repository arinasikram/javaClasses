package Comclass8;

public class BreakAndContinue {
	public static void main(String[]args) {
		
		
		for (int i=0; i<10; i++) {
			
			if (i==2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am ouside of the loop");
		
		
		
		
		
		//continue -it will skip current iteration
		for (int i=1; i<=5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
				
			}
		
		
		
	}
	

