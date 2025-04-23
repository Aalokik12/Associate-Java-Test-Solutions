import java.util.Scanner;

public class MostVowelsFinder {

    /**
     * Counts the number of vowels in a given word.
     *
     * @param word The input word
     * @return Number of vowels in the word
     */
    public static int countVowels(String word) {
        if (word == null) return 0;

        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the string with the most vowels from the array.
     *
     * @param words Array of strings
     * @return The string with the most vowels, or null if input is invalid
     */
    public static String findMostVowels(String[] words) {
        if (words == null || words.length == 0) return null;

        String maxVowelWord = null;
        int maxVowelCount = -1;

        // Iterate through each word and count vowels
        for (String word : words) {
            int vowelCount = countVowels(word);
            if (vowelCount > maxVowelCount) {
                maxVowelCount = vowelCount;
                maxVowelWord = word;
            }
        }

        return maxVowelWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompting user for number of words
            System.out.print("Enter number of words: ");
            int n = Integer.parseInt(scanner.nextLine().trim());

            if (n <= 0) {
                System.out.println("Number of words must be greater than 0.");
                return;
            }

            String[] words = new String[n];
            System.out.println("Enter the words:");

            // Reading 'n' words from user input
            for (int i = 0; i < n; i++) {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Invalid input: Empty string detected.");
                    return;
                }
                words[i] = input;
            }

            // Finding word with most vowels
            String result = findMostVowels(words);

            // Displaying result
            if (result != null) {
                System.out.println("The string with the most vowels is: " + result);
            } else {
                System.out.println("Could not determine the result due to invalid input.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer for number of words.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Ensure the scanner is closed
        }
    }
}
