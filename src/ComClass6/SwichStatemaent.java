package ComClass6;

public class SwichStatemaent {
	public static void main(String[]args) {
		
		int day=600;
		
		String weekDay;
//		if (day==1) {
//			weekDay="Monday";
//		}else if (day==2) {
//			weekDay="Tuesday";
//		}else if(day==3) {
//			
//			weekDay="Wednesday";
//		}else if (day==4) {
//			weekDay="Thursday";
//		}else if (day==5) {
//			
//			weekDay="Friday";
//		}else if(day==5) {
//			weekDay="Saturday";
//		}else if(day==6) {
//			weekDay="Sunday";
//			
//		}else {
//			weekDay="Invalid";
//			
//			System.out.println(weekDay);
//			
			switch (day) {
			
			case 1://day==1
				weekDay="Monday";
				break;
			case 2:
				weekDay="Tuesday";
				break;
			case 3:
				weekDay="wednesday";
				break;
			case 4:
				weekDay="Thursday";
				break;
			case 5:
				weekDay="Friday";
				break;
			case 6:
				weekDay="Saturday";
				break;
			case 7:
				weekDay="Sunday";
				break;
		default:
					weekDay="Invalid";
					break;
			}
			System.out.println(weekDay);
			
				
				
			
			}
	}



