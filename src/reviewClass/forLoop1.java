package reviewClass;

public class forLoop1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		for (int floor=1; floor<4; floor++) {
			System.out.println("floor" + floor + "-->");
			for (int room=1; room<=6; room++) {
				System.out.println(floor + "" + room + "");
				System.out.println(floor + "." +room + "");
			}
			System.out.println();
			
		}

	}

}
