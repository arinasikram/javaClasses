package Comclass8;

public class Continue2 {
	public static void Main(String[]args) {
		
		// I want to print from 1 to 20 except 5,6,7
		for (int a=1; a<=20; a++) {
			
			if (a==5 ||  a==6 || a==7) {
				continue;
			}
			System.out.println(a);
			}
		}
		
	}


