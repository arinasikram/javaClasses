package reviewClass;

public class forLoop {
	public static void main(String[]args) {
		
		for (int i=1; i<=4; i++) {
			System.out.println("Before inner loop");
			System.out.println("*");
			for (int l=1; l<=6;l++) {
				System.out.print("*");
			}
			System.out.println("After inner loop");
		}
	}

}
