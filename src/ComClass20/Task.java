package ComClass20;

public class Task {
	 boolean e (int num) {
		    boolean isPrime1 = true;
		    if (num <= 1) {
		        isPrime1 = false;
		    } else {
		        for (int i = 2; i < num; i++) {
		            if (num % i == 0) {
		                isPrime1 = false;
		                break;
		            }
		        }
		    }
		    return isPrime1;
		    }
	 public static void main(String[] args) {
		 
		 
		System.out.println(isPrime1);
	 }
}
