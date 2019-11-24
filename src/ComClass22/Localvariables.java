package ComClass22;

public final class Localvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Localvariables obj=new Localvariables();
		obj.sayName();
		String userEmail=obj.createEmail("John","Smith","outlook");
		System.out.println(userEmail);
	}	

		void sayName() {
			
			String myName="John";
			System.out.println(myName);
			
			
		}

	
String createEmail(String name,String lastName,String email) {
	
	String userEmail=name+lastName+"@"+email+".com";
	return userEmail;
}
	
}


