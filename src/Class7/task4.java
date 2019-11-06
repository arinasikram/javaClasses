package Class7;

public class task4 {
	public static void main(String[]args) {
		
	
	
	int even=20;
	do {
		System.out.println(even);
		even+=2;
	}while(even<=50);
	System.out.println("--------second way------");
	
	//2 way
	int even1=20;
	do {
	if(even1 % 2==0) {
		System.out.println(even1);
	}
	even1++;
	} while(even<=50);
	}

}
