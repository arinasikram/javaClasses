package ComClass19;

public class Task0 {
	 String createEmail(String name, String lastName,String type) {
	        String email=name+lastName+"@"+type+".com";
	        return email;
	    }
	    public static void main(String[] args) {
	        Task0 obj=new Task0();
	        String email=obj.createEmail("Arinas", "Ikram","gmail");
	        System.out.println(email) ;
	        
}
}