package reviewClass;

import java.util.Scanner;

public class Scannerarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan;
scan =new Scanner(System.in);
System.out.println("How many numbers do you want to enter?");

System.out.println("------------------");
int size=scan.nextInt();

int[] array=new int[5];
for (int i=0; i<array.length;i++) {
	
	array [i]=scan.nextInt();
}
int sum=0;
for (int i=0; i<size; i++) {
	sum+=array[i];
	System.out.println("The sum is" + sum);
}
	}

}
