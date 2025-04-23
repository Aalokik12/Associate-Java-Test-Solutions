import java.util.Scanner;

public class ProductPriceCalculator {

    /**
     * Calculates the gross price before tax.
     *
     * @param netPrice The price after tax.
     * @param taxRate  The tax rate applied (e.g., 0.12 for 12%).
     * @return The gross price before tax, rounded to 2 decimal places.
     */
    public static double calculateGrossPrice(double netPrice, double taxRate) {
        if (netPrice < 0 || taxRate < 0) {
            throw new IllegalArgumentException("Net price and tax rate must be non-negative.");
        }
        return Math.round((netPrice / (1 + taxRate)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompting the user to enter net price
            System.out.print("Enter Net Price (e.g., 99.95): ");
            String netPriceInput = scanner.nextLine().trim();
            double netPrice = Double.parseDouble(netPriceInput);

            // Prompting the user to enter tax rate
            System.out.print("Enter Tax Rate (e.g., 0.12 for 12%): ");
            String taxRateInput = scanner.nextLine().trim();
            double taxRate = Double.parseDouble(taxRateInput);

            // Validating non-negative inputs
            if (netPrice < 0 || taxRate < 0) {
                System.out.println("Error: Net price and tax rate must be non-negative.");
                return;
            }

            // Calculating gross price and printing result
            double grossPrice = calculateGrossPrice(netPrice, taxRate);
            System.out.printf("Gross Price (before tax): %.2f%n", grossPrice);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values (e.g., 99.95, 0.18).");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Ensure scanner is closed to avoid memory leaks
        }
    }
}
