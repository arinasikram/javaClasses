package ClassCom10;

public class AllValuesFromArrays {

	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		int a = 2;
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		a += 2;// 2+2
		System.out.println(grades[a]);
		a--;// 3
		System.out.println(grades[a]);
		System.out.println("_______________");

		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);

		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephent" };
		int size = animals.length;

		for (int i = 0; i < size; i++) {

			System.out.println(animals[i] + "");
		}
// Create an array to store 5 double values ,print all in 1 line

	}

}
