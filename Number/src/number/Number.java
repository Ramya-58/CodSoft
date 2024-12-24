package number;

	import java.util.Scanner;
	import java.util.Random;

	public class Number {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        boolean playAgain = true;
	        int totalScore = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	            while (playAgain) {
	                int min = 1;
	                int max = 100;
	                int maxAttempts = 5;
	                int randomNumber = random.nextInt(max - min + 1) + min;
	                int attempts = 0;
	                boolean guessedCorrectly = false;

	                System.out.println("\nI have generated a random number between " + min + " and " + max + ".");
	                System.out.println("You have " + maxAttempts + " attempts to guess it.");

	                while (attempts < maxAttempts) {
	                    try {
	                        System.out.print("Enter your guess: ");
	                        int userGuess = sc.nextInt();
	                        attempts++;

	                        try {
	                            if (userGuess == randomNumber) {
	                                System.out.printf("Congratulations! You've guessed the correct number in %d attempts.%n", attempts);
	                                totalScore += (maxAttempts - attempts + 1); 
	                                guessedCorrectly = true;
	                                break;
	                            } else if (userGuess > randomNumber) {
	                                System.out.println("Your guess is too high.");
	                            } else {
	                                System.out.println("Your guess is too low.");
	                            }

	                            System.out.printf("Attempts remaining: %d%n", (maxAttempts - attempts));
	                        } catch (Exception e) {
	                            System.out.println("Error in processing guess: " + e.getMessage());
	                        }

	                    } catch (Exception e) {
	                        System.out.println("Invalid input! Please enter a valid integer.");
	                        sc.next(); 
	                    }
	                }

	                if (!guessedCorrectly) {
	                    System.out.printf("Sorry, you've used all your attempts. The correct number was: %d%n", randomNumber);
	                }

	                System.out.print("Do you want to play another round? (yes/no): ");
	                String response = sc.next().trim().toLowerCase();
	                playAgain = response.equals("yes");
	            }

	            System.out.printf("%nGame Over! Your total score is: %d%n", totalScore);
	            System.out.println("Thank you for playing!");

	          

	        sc.close();
	    }
	
	}



