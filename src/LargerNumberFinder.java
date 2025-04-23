

import java.util.Scanner;

public class LargerNumberFinder {

    /**
     * Returns the larger of two numbers.
     *
     * @param a First number.
     * @param b Second number.
     * @return The larger of the two numbers.
     */
    public static int findLarger(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();

            int larger = findLarger(a, b);
            System.out.println("Larger number is: " + larger);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers.");
        } finally {
            scanner.close();
        }
    }
}
