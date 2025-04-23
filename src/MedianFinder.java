import java.util.Scanner;

public class MedianFinder {

    /**
     * Finds the median of a sorted array of doubles.
     *
     * @param arr The sorted array.
     * @return The median or -1.0 if the array is empty.
     */
    public static double findMedian(double[] arr) {
        if (arr == null || arr.length == 0) return -1.0;

        int len = arr.length;
        if (len % 2 == 1) {
            return arr[len / 2]; // middle element
        } else {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //using the try-catch exception handling
        try {
            System.out.print("Enter number of elements in sorted array: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline

            if (n <= 0) {
                System.out.println("Median: -1.0");
                return;
            }
            //taking the inputs for array
            System.out.println("Enter " + n + " sorted elements (space-separated):");
            String inputLine = scanner.nextLine();
            String[] parts = inputLine.trim().split("\\s+");

            if (parts.length != n) {
                System.out.println("Error: Expected " + n + " elements, but got " + parts.length);
                return;
            }

            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Double.parseDouble(parts[i]);
            }

            double median = findMedian(arr);
            System.out.println("Median: " + median);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values."); // exception handling
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
