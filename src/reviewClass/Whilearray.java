package reviewClass;

import java.util.Scanner;

public class Whilearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray=new String[10];
		Scanner scan=new Scanner(System.in);
		int index=0;
		String name="";
		do {
		System.out.println("Enters names,to stop enter 'STOP'");
		name=scan.nextLine();
		strArray[index]=name;
		index++;
	}while(!name.equals("STOP"));
	System.out.print("---------");
	for(int i=0; i<strArray.length; i++) {
		System.out.println(strArray[i]);

	}

}
}