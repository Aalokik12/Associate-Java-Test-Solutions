
import java.util.Scanner;

public class IncomeTaxCalculator {

    /**
     * Computes income tax for the given income using tax slabs.
     *
     * @param income The taxable income.
     * @return The calculated tax.
     */
    public static double computeTax(double income) {
        double tax = 0.0;

        if (income <= 250000) {
            return 0.0;
        }

        if (income > 250000) {
            double slab = Math.min(income, 500000);
            tax += (slab - 250000) * 0.10;
        }

        if (income > 500000) {
            double slab = Math.min(income, 1000000);
            tax += (slab - 500000) * 0.20;
        }

        if (income > 1000000) {
            tax += (income - 1000000) * 0.30;
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your taxable income: Rs. ");
            double income = scanner.nextDouble();

            if (income < 0) {
                System.out.println("Income cannot be negative.");
                return;
            }

            double tax = computeTax(income);
            System.out.printf("Your income tax is: Rs. %.2f\n", tax);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
