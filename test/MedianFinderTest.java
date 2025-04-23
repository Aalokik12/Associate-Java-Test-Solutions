

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the MedianFinder utility
class MedianFinderTest {

    // Test case for an array with a single element
    @Test
    void testSingleElement() {
        // Median of a single-element array should be the element itself
        assertEquals(10.7, MedianFinder.findMedian(new double[]{10.7}));
    }

    // Test case for an odd-length sorted array
    @Test
    void testOddArray() {
        // Median of {1.0, 2.0, 3.0} is 2.0
        assertEquals(2.0, MedianFinder.findMedian(new double[]{1.0, 2.0, 3.0}));
    }

    // Test case for an even-length sorted array
    @Test
    void testEvenArray() {
        // Median of {17.4, 21.1, 39.7, 48.0} is (21.1 + 39.7) / 2 = 30.4
        assertEquals(30.4, MedianFinder.findMedian(new double[]{17.4, 21.1, 39.7, 48.0}));
    }

    // Test case with all negative numbers
    @Test
    void testNegativeNumbers() {
        // Median of {-957, -493, -384, -268, -131} is -384
        assertEquals(-384.0, MedianFinder.findMedian(new double[]{-957.0, -493.0, -384.0, -268.0, -131.0}));
    }

    // Test case for an empty array
    @Test
    void testEmptyArray() {
        // Expected output for empty array is -1.0 as per implementation
        assertEquals(-1.0, MedianFinder.findMedian(new double[]{}));
    }
}
