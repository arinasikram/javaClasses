package ComClass31;

public class Task4 {
	
	}
	class Car {
		double price;
		String color;
		public double calculateSalePrice() {
			return price;
		}
	}
	class Sedan extends Car {
		int length;
		public double calculateSalePrice() {
			if (length > 20) {
				price = price - (price * 0.95);
			} else {
				price = price - (price * 0.9);
			}
			return price;
		}
	}
	class Truck extends Car {
		int weight;
		public double calculateSalePrice() {
			if (weight > 2000) {
				price = price - (price * 0.9);
			} else {
				price = price - (price * 0.8);
			}
			return price;
			
		}
	
	
	
	}
	

