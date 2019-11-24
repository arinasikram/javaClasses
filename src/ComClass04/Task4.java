package ComClass04;

public class Task4 {
	
	public static void main(String[]args) {
		
		/*If user has diploma 
		 * or user has not diploma
		 * if user has Degree programm
		 * check gpa score
		 * you are elligible for scholarship if you gpa is higher or equals
		 * 
		 * 
		 */
		
		boolean hasdiploma=false;
		double gpa=2.5;
		if (hasdiploma) {
			System.out.print("Congragulation");
			
			
			if(gpa>=3.5) {
				System.out.println("you are eligible for scholarship");
				
			}else {
				System.out.println("You should study harder");
				
			}
		}else {
			
			System.out.println("You should get a degree programe");
			
			//task2
			double morgageRate=4.5;
			int morgagePrice=210000;
			
			if (morgagePrice>4.5) {
				System.out.println("You will not buy a house");
			}else {
				
			
				if (morgagePrice>200000) {
					
					System.out.println("Take a loan");
					
				}
				System.out.println("Consider buying a house");
				
			}
			
		}
		
		
		
	}

}
