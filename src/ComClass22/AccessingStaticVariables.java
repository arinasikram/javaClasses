package ComClass22;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		
		Husky obj=new Husky();
		// TODO Auto-generated method stub
		
		System.out.println(obj.name);
		
		System.out.println(Husky.breed);
		System.out.println(obj.breed);

	}

}
