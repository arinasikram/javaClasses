package ComClass13;

public class RegularEpressions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Today is our Java class";
		
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replaceAll(" \\s", ""));
	}

}
