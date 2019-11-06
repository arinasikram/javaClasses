package ComClass6;

public class Recap {
	public static void main(String[]args) {
	int time=10;
	String timeOfDay;
	
	if (time>=1 && time <=11) {
		
		timeOfDay="Morning";
		
	}else if (time>=12 && time<=15) {
		
		timeOfDay="Noon";
		
	}else if (time>=16 && time<=20) {
		
		timeOfDay="Evening";
		
	}else if (time>20 && time<=24) {
		timeOfDay="Night";
	}else {
		timeOfDay="Invalid";
	}
	System.out.println("Time of the day is "+timeOfDay);
	if (timeOfDay.contentEquals("Morning")){
		System.out.println("Good morning");
		
	
		
		
	}
		
		
	}

}
