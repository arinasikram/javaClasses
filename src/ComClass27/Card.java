package ComClass27;

public class Card {

	public void chargeInterest() {
		System.out.println("Card charges 25% interest");
	}

	public void creditLimit() {// 
		System.out.println("Credit limit of the card is 5000");
	}

}

class Ax extends Card {
	public void creditLimit() {// overrridin method
		System.out.println("Credit limit of the Ax card is 25000");
	}

}

class Mc extends Card {
	
	public void creditLimit() {// overrriding method
		System.out.println("Credit limit of the Mc card is 15000");

}
	
	public void cashBack() {
		System.out.println("Mc gives cash back of 3%");
	}

class Visa extends Card {
	
	public void creditLimit() {// overrriding method
		System.out.println("Credit limit of the Visa card is 2000");
}
	
	class Discovery extends Card{
		public void cardLimit() {
			System.out.println(" Credit limit of the Discovery card is 5000");
		}
			
		}
	}

}
