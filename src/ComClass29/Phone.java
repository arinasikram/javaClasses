package ComClass29;

public abstract class Phone {
	// implemented method
	public void makeCall() {
		
		System.out.println("Make call");
	}
public void sendText() {
	System.out.println("Send text");
}

// unimplemented methods
public abstract void takePictures();

public abstract void playGames();
}
// concrete class
class iPhone extends Phone{
	public  void takePictures() {
	System.out.println("iPhone takes pictures");
}

public void playGames() {
	System.out.println(" Play games on iPhone ");
	
}	
	
}

class Samsung extends Phone{
	
	public  void takePictures() {
		System.out.println("Samsung takes pictures");
	}
	
	public void playGames() {
		System.out.println(" Play games on samsung ");
		
	}	
	
}
