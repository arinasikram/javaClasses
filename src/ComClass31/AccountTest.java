package ComClass31;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc=new Account();
			acc.setAccountNumber(8669699);
			long accountNum=acc.getAccountNumber();
			System.out.println(accountNum);
			
			
			acc.setBalance(200);
			double myBalance=acc.getbalance();
			System.out.println(myBalance);
			
			int num=123;
			String.valueOf(num);//converts

	}

}
