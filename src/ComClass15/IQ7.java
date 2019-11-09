package ComClass15;

public class IQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		boolean isPrime = true;
	//	if (num == 0 || num == 1) {
	//	} else {
	//	}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;

			}
		}

		if (isPrime) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is  NOT Prime number");
		}
	}

}
