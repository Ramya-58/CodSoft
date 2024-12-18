package numberGame;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        boolean playAgain = true;
	        int totalScore = 0;

	        System.out.println("Welcome to the Number Guessing Game!...");

	        while (playAgain) {
	            int lowerBound = 1;
	            int upperBound = 100;
	            int maxAttempts = 5;
	            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	            int attempts = 0;
	            boolean guessedCorrectly = false;

	            System.out.println("\nI have selected a number between " + lowerBound + " and " + upperBound + ".");
	            System.out.println("You have " + maxAttempts + " attempts to guess it.");

	            while (attempts < maxAttempts && !guessedCorrectly) {
	                System.out.print("Enter your guess number: ");
	                int userGuess;

	                //reading the input
	                try {
	                    userGuess = Integer.parseInt(sc.nextLine());
	                } catch (NumberFormatException e) {
	                    System.out.println("Please enter a valid number.");
	                    continue;
	                }

	                attempts++;

	                if (userGuess < randomNumber) {
	                    System.out.println("Sorry,that is too low please try again!");
	                } else if (userGuess > randomNumber) {
	                    System.out.println("Sorry,that is too hight please try again!");
	                } else {
	                    System.out.println("Congratulations! you  guessed the number correctly in given" + attempts + " attempts.");
	                    guessedCorrectly = true;
	                    totalScore += maxAttempts - attempts + 1; 
	                }
	            }

	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
	            }

	            System.out.println("Your current score is: " + totalScore);
	            System.out.print("Do you want to play another round? (yes/no): ");
	            String response = sc.nextLine().trim().toLowerCase();
	            playAgain = response.equals("yes") || response.equals("y");
	        }

	        System.out.println("Thank you for playing! Your final score is: " + totalScore);
	        sc.close();
	    }
	}
