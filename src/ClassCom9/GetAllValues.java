package ClassCom9;

public class GetAllValues {
	public static void main (String[]args) {
		
		
		String []animals= {"Cat","Cow","Snake","Dog","Elephant"};
		
		for (int i=0; i<animals.length; i++) {
			
			if(animals[i].equals("Dogs")){
				System.out.println("I love dogs");
			}else {
				System.out.println(animals[i]);
			}
		}
	}

}
