// LargestOfThree
// JB

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

            System.out.println("\n\n A program that chooses the largest integer out of three \n\n");

            // Create Scanner for input
            Scanner scanner = new Scanner(System.in);

            // Continuously ask for input until the user chooses to quit
            String continueChoice;

        do {
            // Ask user for three numbers
            System.out.println("Welcome to the Largest Number Finder!");
            System.out.println("Please enter three integers to find the largest among them.");

            int num1 = getValidInteger(scanner, "Enter the first integer: ");
            int num2 = getValidInteger(scanner, "Enter the second integer: ");
            int num3 = getValidInteger(scanner, "Enter the third integer: ");

            // Find the largest number using nested if statements
            int largest;
            if (num1 >= num2) {
                if (num1 >= num3) {
                    largest = num1; // num1 is the largest
                } else {
                    largest = num3; // num3 is the largest
                }
            } else {
                if (num2 >= num3) {
                    largest = num2; // num2 is the largest
                } else {
                    largest = num3; // num3 is the largest
                }
            }

            // Display result
            System.out.println("Among the numbers " + num1 + ", " + num2 + ", and " + num3 + ", the largest number is: " + largest);

            // Ask if user wants to continue
            System.out.print("Would you like to check another set of numbers? (yes/no): ");
            continueChoice = scanner.next().toLowerCase();

        } while (continueChoice.equals("yes"));

        System.out.println("Thank you for using the Largest Number Finder! Goodbye!");
        scanner.close();
    }

    // Helper method to get valid integer input - i searched this
    private static int getValidInteger(Scanner scanner, String prompt) {
        int num;
        while (true) {
            try {
                System.out.print(prompt);
                num = Integer.parseInt(scanner.nextLine());
                break; // Exit loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        return num;
    }
        }

