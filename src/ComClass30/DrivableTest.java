package ComClass30;

public class DrivableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drivable obj=new Toyota();
		obj.drive();
		//obj.DRIVE_FAST=false;CE: final value cannot be reassigned
Toyota toyota=new Toyota();
toyota.drive();
toyota.stop();
	}

}
