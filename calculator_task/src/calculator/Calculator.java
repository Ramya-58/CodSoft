package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

       
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        
       
            for (int i = 0; i < numSubjects; i++) {
                int inputMark;
                while (true) {
                    System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
                    inputMark = sc.nextInt();
              
                    if (inputMark >= 0 && inputMark <= 100) {
                        break;
                    } else {
                        System.out.println("Invalid input. Marks should be between 0 and 100. Please try again.");
                    }
                }
                marks[i] = inputMark; 
                totalMarks += marks[i]; 
            }


        
        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
