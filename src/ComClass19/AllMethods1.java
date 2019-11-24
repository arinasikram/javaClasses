package ComClass19;

public class AllMethods1 {
	
	
	int sum(int num1, int num2) {
		
		
		int result=num1+num2;
		return result;
		
	}
 int sub(int num1, int num2) {
	 
	 int sub=num1-num2;
	 return sub;
 }
 
 int div(int num1,int num2) {
	 
	 int div=num1/num2;
	 return div;
 }
int mult(int num1,int num2) {
	 
	 int mult=num1*num2;
	 return mult;
 }
int findLargest(int num1,int num2) {
	
	
	int largest;
	if(num1>num2) {
		
		largest=num1;
	}else {
		largest=num2;
		
		
	}
	return largest;
	
}

boolean isOdd(int num) {
	boolean isOdd;
	
	if (num%2!=0) {
		
		isOdd=true;
	}else {
		
		isOdd=false;
		
		
	}
	return isOdd;
}
	
String weekDayName(int weekDay) {
	String weekDayName;
	switch(weekDay) {
	case 1:
		weekDayName="Monay";
		break;
	case 2:
		weekDayName="Tuesday";
		break;
	case 3:
		weekDayName="Wednesday";
		break;
	case 4:
		weekDayName="Thursday";
		break;
	case 5:
		weekDayName="Friday";
		break;	
	case 6:
		weekDayName="saturday";
		break;
	case 7:
		weekDayName="Sunday";
		break;	
		Default:
			weekDayName="Unknown";
	}
	return weekDayName;
}
	String day=obj.weekDayName(5);
	if (day.equalls("Tueday")||day.equals("Wednesday")||day.equals("Thursday")
			day.equals("Sunday")
			System.out.println("We are learning Java");
}else {
	System.out.println("We are not learning Java");
	
}

