import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for SecondLargestFinder
public class SecondLargestFinderTest {

    // Test case with a normal array of numbers
    @Test
    void testNormalCase() {
        int[] numbers = {1, 3, 5, 7, 9, 2};
        // The second largest number in the array is 7
        assertEquals(7, SecondLargestFinder.findSecondLargest(numbers));
    }

    // Test case with only a single element in the array
    @Test
    void testSingleElement() {
        int[] numbers = {4};
        // A single element array does not have a second largest number, so we return Integer.MIN_VALUE
        assertEquals(Integer.MIN_VALUE, SecondLargestFinder.findSecondLargest(numbers));
    }

    // Test case with exactly two elements in the array
    @Test
    void testTwoElementArray() {
        int[] numbers = {10, 20};
        // The second largest number in a two-element array is the smaller number, which is 10
        assertEquals(10, SecondLargestFinder.findSecondLargest(numbers));
    }

    // Test case where all elements in the array are the same
    @Test
    void testAllSameElements() {
        int[] numbers = {5, 5, 5, 5};
        // Since all elements are the same, there's no second largest number, so we return Integer.MIN_VALUE
        assertEquals(Integer.MIN_VALUE, SecondLargestFinder.findSecondLargest(numbers));
    }

    // Test case with negative numbers in the array
    @Test
    void testNegativeNumbers() {
        int[] numbers = {-1, -5, -3, -7};
        // The second largest number is -3, since -1 is the largest and -5 is the smallest
        assertEquals(-3, SecondLargestFinder.findSecondLargest(numbers));
    }
}
