// MadnessWithMethods
// JB
// Note to Professor - I am not sure I hae completed this project correctly, so let me know!

import java.util.Scanner;

public class MadnessWithMethods {
    // Get number from user
    public static int getNumberFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int number = scanner.nextInt();  // Read the integer
        scanner.nextLine(); // Consume the newline character left by nextInt()
        return number;
    }

    // Check if number is odd or even
    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    // Multiply number by constant
    public static int multiplyByConstant(int number, int constant) {
        return number * constant;
    }

    public static void main(String[] args) {
        // Get a number from the user
        int userNumber = getNumberFromUser("Enter an integer: ");

        // Check if the number is even or odd
        checkEvenOrOdd(userNumber);

        // Multiply the number by a constant and display result
        int constant = 5;  // You can change this constant value
        int result = multiplyByConstant(userNumber, constant);
        System.out.println("The number " + userNumber + " multiplied by " + constant + " is " + result);
    }
}


