package ComClass27;

import javax.crypto.Mac;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// reference variable=object is created	
	Card card	=new Ax();
	card.chargeInterest();
	card.creditLimit();
	
	
	Card card1=new Mc();
	card1.creditLimit();
	
	Card card2=new Visa();
	card2.creditLimit();
	
	// type [] arrayName={};
	//type [] arrayNmae=new type[];
	int [] numArray= {10,12,13};
	String[] stringArray= {"aa","bb"};
	
	// 1 we created objects and assiged the variables and then sorted those variables inside
	//the array.
	
	Card[] cardArray= {card, card1,card2};
	
	// creating an object and storing it directly into an Array of 
	Card[] cardArray1= {new Mc(),new Ax(),new Visa(),new Card()};
	
	
	// cardArray[0]-->MC
	//cardArray[3]-->Discovery
	
	for(Card myCard:cardArray1) {
		
		myCard.creditLimit();
		
		
		
	}
	for(int y=0; y<cardArray1.length; y++) {
		cardArray1[y].creditLimit();
	}

	Card c1=new Card();
	c1.chargeInterest();
	c1.creditLimit();

	Ax ax1=new Ax();
	ax1.chargeInterest();
	ax1.creditLimit();

	Mc mc1=new Mc();
	mc1.cashBack();
	mc1.chargeInterest();
	mc1.creditLimit();

	Mc mc2=new Mc();
	Mc mc3=new Mc();

	Card cc=new Mc();
	cc.chargeInterest();
	cc.creditLimit();


	Mc[] masterCards= {mc1,mc2,mc3};
	for(Mc mCard:masterCards) {
		mCard.cashBack();
		mCard.chargeInterest();
		mCard.creditLimit();
	}







	}



}









		

	


