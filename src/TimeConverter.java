import java.util.Scanner;

public class TimeConverter {

    /**
     * Converts total seconds into days, hours, minutes, and seconds.
     *
     * @param totalSeconds Total number of seconds.
     * @return Formatted string in "X Day(s) Y Hour(s) Z Minute(s) W Second(s)"
     */
    public static String convertSecondsToTime(long totalSeconds) {
        if (totalSeconds < 0) {
            return "Invalid input: seconds cannot be negative.";
        }

        // Calculate number of days
        long days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);

        // Calculate number of hours
        long hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        // Calculate number of minutes
        long minutes = totalSeconds / 60;

        // Remaining seconds
        long seconds = totalSeconds % 60;

        return String.format("%d Day(s) %d Hour(s) %d Minute(s) %d Second(s)", days, hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for number of seconds
            System.out.print("Enter number of seconds: ");
            String input = scanner.nextLine().trim();

            // Try to parse the input
            long seconds = Long.parseLong(input);

            // Get and print the time equivalent
            String result = convertSecondsToTime(seconds);
            System.out.println("Time equivalent: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid non-negative whole number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close scanner to free up resource
        }
    }
}
