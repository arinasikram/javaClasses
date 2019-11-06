
public class LogicalAnd {
	
	
	public static void main (String[]args) {
		
		
		int num=200;
		
		if (num>1 && num <10) {
			System.out.println("the number is small");
			//true AND false-->false
		}else if (num>=10 && num<1000) {
			System.out.println("this number is medium");
			// true AND false-->false
		}else if (num>=100 && num<1000) {
			
			System.out.println("this number is lage");
			// true ANd true -->true
			
		}else {
			System.out.println("Number is out of our range");
			
		}
		
		
		
		
		
		
	}

}
