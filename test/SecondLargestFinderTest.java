import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for SecondLargestFinder
public class SecondLargestFinderTest {

    // Test case with normal array of numbers
    @Test
    void testNormalCase() {
        int[] numbers = {1, 3, 5, 7, 9, 2};
        // The second largest number should be 7
        assertEquals(7, SecondLargestFinder.findSecondLargest(numbers));
    }

    // Test case with only a single element in the array
    @Test
    void testSingleElement() {
        int[] numbers = {4};
        // A single element array can't have a second largest, so we return Integer.MIN_VALUE
        assertEquals(Integer.MIN_VALUE, SecondLargestFinder.findSecondLargest(numbers));
    }

    // Test case with exactly two elements in the array
    @Test
    void testTwoElementArray() {
        int[] numbers = {10, 20};
        // The second largest number should be 10 in a two-element array
        assertEquals(10, SecondLargestFinder.findSecondLargest(numbers));
    }

    // Test case where all elements in the array are the same
    @Test
    void testAllSameElements() {
        int[] numbers = {5, 5, 5, 5};
        // All elements are the same, so there's no second largest, return Integer.MIN_VALUE
        assertEquals(Integer.MIN_VALUE, SecondLargestFinder.findSecondLargest(numbers));
    }

    // Test case with negative numbers in the array
    @Test
    void testNegativeNumbers() {
        int[] numbers = {-1, -5, -3, -7};
        // The second largest number should be -3
        assertEquals(-3, SecondLargestFinder.findSecondLargest(numbers));
    }
}
