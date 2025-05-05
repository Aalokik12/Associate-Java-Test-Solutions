import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecialTwoDigitCheckerTest {

    @Test
    void testValidSpecialNumber() {
        // Known special two-digit numbers: e.g., 19 (1 + 9 + 1*9 = 19)
        assertTrue(SpecialTwoDigitChecker.isSpecialTwoDigit(19));
    }

    @Test
    void testAnotherSpecialNumber() {
        // Another known special number: 59 (5 + 9 + 5*9 = 59)
        assertTrue(SpecialTwoDigitChecker.isSpecialTwoDigit(59));
    }

    @Test
    void testNonSpecialNumber() {
        // Non-special number like 23
        assertFalse(SpecialTwoDigitChecker.isSpecialTwoDigit(23));
    }

    @Test
    void testLowerBound() {
        // Test with number less than 10 (not two-digit)
        assertFalse(SpecialTwoDigitChecker.isSpecialTwoDigit(5));
    }

    @Test
    void testUpperBound() {
        // Test with number more than 99 (not two-digit)
        assertFalse(SpecialTwoDigitChecker.isSpecialTwoDigit(123));
    }

    @Test
    void testEdgeTwoDigitNonSpecial() {
        // 10 is two-digit but not special
        assertFalse(SpecialTwoDigitChecker.isSpecialTwoDigit(10));
    }

    @Test
    void testEdgeTwoDigitSpecial() {
        // 29 is also a known special number (2 + 9 + 2*9 = 29)
        assertTrue(SpecialTwoDigitChecker.isSpecialTwoDigit(29));
    }
}
