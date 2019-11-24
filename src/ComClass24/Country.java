package ComClass24;

public class Country {
	Country() {
		System.out.println("I am non argument constructor");
	}

	public String capital, name;

	Country(String countryName, String countryCapital) {
		name = countryName;
		capital = countryCapital;
	}
	public void displayInfo() {
		System.out.println(name+" "+capital);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Country country1 = new Country("USA", "WasingtonDc");

		// country1.name="USA";
		// country1.capital="Washington DC";

		Country country2 = new Country("Kazakistan", "Astana");

		// country2.name="Kazakistan";
		// country2.capital="Astana";

		Country country3 = new Country();
		
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();
		//System.out.println(country1.name);

	}

}
