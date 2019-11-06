package ComClass6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[]args) {
		
		 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("there is a sale.True orFalse?");
		boolean sale=scan.nextBoolean();
		
		System.out.println("what is the price?");
		int price=scan.nextInt();
		double lastPrice=0.0;
	
			if (sale) {
				if(price<20) {
					lastPrice=price*0.9;
				}else if (price>=20 && price<100) {
					lastPrice=price*0.8;
				}else if(price>=100 && price<500) {
					lastPrice=price*0.7;
				}else {
					lastPrice=price*0.5;
				}	
				}else {
					System.out.println("I am not shoping");
						
				}
			System.out.println("After discount the price of"
					+"the item reduce from "+price+" to " +lastPrice);
					
		
		
	}
	
}
