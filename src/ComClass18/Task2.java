package ComClass18;

public class Task2 {
void evenorOdd(int num) {
		
		if(num%2==0) {
			System.out.println(num+"is even");
			
		}
	else {
		System.out.println(num+ " is odd");	
	}
	
}
	public static void main (String[]args) {
	
	Task2 n=new Task2();
	n.evenorOdd(5);

	}
}
