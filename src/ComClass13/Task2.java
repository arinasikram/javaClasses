package ComClass13;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="Sunday";
	
	;
	
	
	for(int i=day.length()-1;i>=0;i--) {
		
		
		System.out.println(day.charAt(i));
		
		
		String str1="Hello";
		int middle=str1.length()/2;
		
		if(!str1.isEmpty()) {
			if(str1.length()%2!=0&& str1.length()>=3) {
				System.out.println(str1.charAt(middle));
				
			}
		}
	}
		
	}

}
