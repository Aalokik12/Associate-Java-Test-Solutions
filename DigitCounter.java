/**
 *
 * Program that reads an integer input from the user
 * and prints the number of digits, handling all edge cases.
 */

 import java.util.Scanner;

 public class DigitCounter {
 
     /**
      * Counts the number of digits in a given integer.
      *
      * @param number the integer whose digits are to be counted
      * @return the count of digits (always at least 1, even for 0)
      */
     public static int countDigits(int number) {
         number = Math.abs(number);
         if (number == 0) return 1;
 
         int count = 0;
         while (number > 0) {
             count++;
             number /= 10;
         }
         return count;
     }
 
     /**
      * Main method to accept input and display the digit count.
      * Handles invalid input gracefully.
      */
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter an integer: ");
 
         try {
             String input = scanner.nextLine().trim();
 
             // Handle blank input
             if (input.isEmpty()) {
                 System.out.println("Input is empty. Please enter a valid integer.");
                 return;
             }
 
             // Parse to integer manually to detect overflow
             int number = Integer.parseInt(input);
             int digits = countDigits(number);
             System.out.println("Number of digits: " + digits);
 
         } catch (NumberFormatException e) {
             System.out.println("Invalid input! Please enter a valid 32-bit integer.");
         } finally {
             scanner.close();
         }
     }
 }
 