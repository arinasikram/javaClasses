package Class7;

public class WhileLoopPractice {
	
	public static void main(String[]args) {
		int a=50;
		while(a>=20) {
			System.out.println(a);
			a--; // -1 a=a-1;
		}	
		//even numbers
			int z=2;
			while (z<=20) {
				System.out.println(z);
			}
				z+=2;
			//  2 way using modulus
			
			int q=1;
			
			while(q<=20) {
			if (q%2==0) {
				System.out.println(q);
			
			}
			q++;
			}
		
	System.out.println("*****************");
	
	//print only odd number from 50 to 100
		// print only even numbers from 100 to 1
		int b=50;
		while (b<=100) {
			if(b%2==1) {
				
				System.out.println(b);
			}
		
		b--;
int c=100;
while(b>=1) {
	if(b%2==0) {
		System.out.println(b);
	}
	b--;
}
		}

	
	
	
	}}
	

