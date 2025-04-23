import java.util.Scanner;

public class RetailInflationCalculator {

    /**
     * Calculates compounded inflation over given years.
     *
     * @param rate  Inflation rate per year (as decimal, e.g., 0.20 for 20%)
     * @param years Number of years
     * @return Compounded inflation percentage (e.g., 149.0 for 149%)
     */
    public static double calculateCompoundedInflation(double rate, int years) {
        if (rate < 0 || years < 0) {
            throw new IllegalArgumentException("Rate and years must be non-negative.");
        }

        // Using compound interest formula: (1 + r)^t - 1
        double compoundedFactor = Math.pow(1 + rate, years);
        double inflationPercentage = (compoundedFactor - 1) * 100;

        // Rounding to 2 decimal places
        return Math.round(inflationPercentage * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for the inflation rate as percentage
            System.out.print("Enter retail inflation rate (as %): ");
            String rateInput = scanner.nextLine().trim();
            double ratePercent = Double.parseDouble(rateInput);

            // Ask the user for the number of years
            System.out.print("Enter number of years: ");
            String yearsInput = scanner.nextLine().trim();
            int years = Integer.parseInt(yearsInput);

            // Validate input
            if (ratePercent < 0 || years < 0) {
                System.out.println("Error: Rate and years must be non-negative.");
                return;
            }

            // Convert rate from percent to decimal
            double rateDecimal = ratePercent / 100;

            // Calculate compounded inflation
            double result = calculateCompoundedInflation(rateDecimal, years);

            System.out.println("Compounded retail inflation after " + years + " year(s) is: " + result + "%");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values (e.g., 20 for 20%).");
        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            // Always close the scanner to prevent resource leaks
            scanner.close();
        }
    }
}
