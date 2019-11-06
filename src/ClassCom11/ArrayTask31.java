package ClassCom11;

public class ArrayTask31 {
	
	public static void main(String[]args) {
		
		
		String[]countries= {"India","Canada","USA"};
		for (String getCountry:countries) {
			if(getCountry.equals("USA")) {
				System.out.println("The capital of USA is Washington DC");
			}
			for (int i = 0; i < countries.length; i++) {
				System.out.println(countries[i]);
				
			}
		}
	}

}
