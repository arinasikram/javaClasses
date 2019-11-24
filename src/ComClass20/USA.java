package ComClass20;

public class USA {

	private String capitalCity = "Washington DC";
	public String mainState = "New York";
	protected String school = "";

	public static void main(String[] args) {

		USA us = new USA();
		System.out.println("Access from Mexico class");
		System.out.println(us.mainState);
		System.out.println(us.school);
		System.out.println(us.capitalCity);

	}

}
