import java.util.Scanner;

public class SecondLargestFinder {

    /**
     * Finds the second largest number in an unsorted array of numbers.
     *
     * @param numbers The array of numbers
     * @return The second largest number, or Integer.MIN_VALUE if not possible
     */
    public static int findSecondLargest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            // Not enough elements to find second largest
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse array to find the largest and second largest
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for number of elements
            System.out.print("Enter number of elements in the array: ");
            String input = scanner.nextLine().trim();
            int n = Integer.parseInt(input);

            // Validate array length
            if (n < 2) {
                System.out.println("Array must contain at least 2 elements.");
                return;
            }

            // Take array input
            int[] numbers = new int[n];
            System.out.println("Enter " + n + " integer(s):");
            for (int i = 0; i < n; i++) {
                String elementInput = scanner.nextLine().trim();
                numbers[i] = Integer.parseInt(elementInput);
            }

            // Find and display second largest number
            int secondLargest = findSecondLargest(numbers);
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest element found.");
            } else {
                System.out.println("The second largest number is: " + secondLargest);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integer values.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close scanner to free system resources
        }
    }
}
