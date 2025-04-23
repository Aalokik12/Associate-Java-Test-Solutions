import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the LargerNumberFinder class
class LargerNumberFinderTest {

    // Test when the first number is larger than the second
    @Test
    void testFirstIsLarger() {
        // 10 is larger than 3
        assertEquals(10, LargerNumberFinder.findLarger(10, 3));
    }

    // Test when the second number is larger than the first
    @Test
    void testSecondIsLarger() {
        // 12 is larger than 4
        assertEquals(12, LargerNumberFinder.findLarger(4, 12));
    }

    // Test when both numbers are equal
    @Test
    void testEqualNumbers() {
        // Both numbers are 5, so function should return 5
        assertEquals(5, LargerNumberFinder.findLarger(5, 5));
    }

    // Test with negative numbers
    @Test
    void testNegativeNumbers() {
        // -2 is larger than -5
        assertEquals(-2, LargerNumberFinder.findLarger(-5, -2));
    }
}
