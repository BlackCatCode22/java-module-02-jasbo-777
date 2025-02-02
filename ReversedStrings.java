// ReversedStrings
// JB

import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {

            System.out.println("\n\n Write a program that reverses word \n\n");

            // Choose a word to reverse
            String stringinput = "spiritual";

            // Reverse word
            char[] resultarray = stringinput.toCharArray();

            // Result
            for (int i = resultarray.length - 1; i >= 0; i--)

            // print reversed String
            System.out.print(resultarray[i]);

        }
    }
