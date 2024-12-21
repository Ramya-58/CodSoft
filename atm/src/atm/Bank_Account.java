package atm;

public class Bank_Account {
	 private double balance;

	    public Bank_Account(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
	            this.balance = 0;
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public boolean deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            return true;
	        } else {
	            return false;
	        }
	    }
	}



