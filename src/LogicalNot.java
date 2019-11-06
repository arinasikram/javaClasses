
public class LogicalNot {

	public static void main(String[]args) {
		
		boolean b1=! true;
		boolean b2=! false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		
		if (!traffic) {
			
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
			
			
		}
		
		boolean isRain=false;
		if (!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Dont take an Umbrella");
		// lets compare 2 numbers using not operators	
			int num1=10;
			int num2=11;
			
			if (num1==num2) {
				System.out.println("Numbers are not equal");
				
			}
			
			if (!(num1==num2)){
				System.out.println("Number are not equal");
			}else {
				System.out.println("Number are equal");
				
			}
		}
		
		
		
		
		
	}
}
