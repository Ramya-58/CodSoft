package atm;

public class Atm_machine {

	public static void main(String[] args) {
		 Bank_Account userAccount = new Bank_Account(500); 
	        ATM atm = new ATM(userAccount);
	        atm.start();

	}

}
