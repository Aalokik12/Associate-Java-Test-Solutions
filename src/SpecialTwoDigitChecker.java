import java.util.Scanner;

public class SpecialTwoDigitChecker {

    /**
     * Checks whether the given number is a special two-digit integer.
     * A special two-digit integer satisfies: digit1 + digit2 + (digit1 * digit2) == number
     *
     * @param number The input number
     * @return true if it is a special two-digit integer, false otherwise
     */
    public static boolean isSpecialTwoDigit(int number) {
        if (number < 10 || number > 99) {
            return false; // Number is not two-digit
        }

        int tens = number / 10;
        int ones = number % 10;

        return (tens + ones + (tens * ones)) == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for a two-digit number
            System.out.print("Enter a two-digit number: ");
            String input = scanner.nextLine().trim();
            int number = Integer.parseInt(input);

            // Check and display result
            if (isSpecialTwoDigit(number)) {
                System.out.println(number + " is a special two-digit integer.");
            } else {
                System.out.println(number + " is NOT a special two-digit integer.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid two-digit number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Clean up resource
        }
    }
}
