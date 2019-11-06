package ComClass13;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="14234He45645lo465456";
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		
		
		String str2="Hi#$%How#$%4356345";
		
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
