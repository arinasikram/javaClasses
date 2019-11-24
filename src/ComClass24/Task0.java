package ComClass24;

public class Task0 {
	
	private  Task0() {
		System.out.println("It is private ");
	}

	public String capital, name;

public	Task0(String countryName, String countryCapital) {
		name = countryName;
		capital = countryCapital;
	}
	public void displayInfo() {
		System.out.println(name+" "+capital);
	}

	public static void main(String[] args) {
		

		Task0 country1 = new Task0("USA", "WasingtonDc");

	
	

		Task0 country2 = new Task0("Kazakistan", "Astana");

		
	

		Task0 country3 = new Task0("Japan","Tokyo");
		Task0 country4 = new Task0();
		
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();
		//System.out.println(country1.name);

	}

}



