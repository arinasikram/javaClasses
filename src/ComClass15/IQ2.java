package ComClass15;

import java.util.Arrays;

public class IQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 100, -90, 8787, 898, 0, 1, 90, 8787 };

// 1 easiest way
		Arrays.sort(array);
		int min = array[0];
		int max = array[array.length - 1];

		System.out.println(min);
		System.out.println(max);

// 2 way

		int[] myArray = { 100, -90, 8787, 0, 1, 90, 8787 };
		int largest = myArray[0];
		int smallest = myArray[0];

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > largest) {

				largest = myArray[i];
			}
			if (myArray[i] < smallest) {
				smallest = myArray[i];
			}
		}
		System.out.println("The smallest value in the array" + smallest);
		System.out.println("The largest value in the array" + largest);

		//////
		int[] myArray1 = { 100, -90, 8787, 898, 0, 1, 90, 8787 };
		int large = myArray1[0];
		int secondLarge = myArray1[0];

		for (int i = 0; i < myArray1.length; i++) {
			if (myArray1[i] > large) {
				secondLarge = large;
				large = myArray1[i];
			}
			if (myArray1[i] > secondLarge) {
				secondLarge = myArray[i];
			}

		}
		System.out.println("The 2 largest value in the array is "+secondLarge);
		System.out.println("The  largest value in the array is "+large);
	}
}
