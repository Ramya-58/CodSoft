package atm;
import java.util.Scanner;


	class ATM {
	    private Bank_Account account;

	    public ATM(Bank_Account account) {
	        this.account = account;
	    }

	    public void start() {
	        Scanner scanner = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            System.out.println("\nWelcome to the ATM!");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    running = false;
	                    System.out.println("Thank you for using the ATM.");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	        scanner.close();
	    }

	    private void checkBalance() {
	        System.out.printf("Your current balance is: $%.2f\n", account.getBalance());
	    }

	    private void deposit(double amount) {
	        if (account.deposit(amount)) {
	            System.out.printf("Successfully deposited $%.2f.\n", amount);
	        } else {
	            System.out.println("Deposit failed. Amount must be greater than 0.");
	        }
	    }

	    private void withdraw(double amount) {
	        if (account.withdraw(amount)) {
	            System.out.printf("Successfully withdrew $%.2f.\n", amount);
	        } else {
	            System.out.println("Withdrawal failed. Check if the amount is positive and within your balance.");
	        }
	    }
	}


