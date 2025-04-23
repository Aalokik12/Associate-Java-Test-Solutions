/**
 * DigitCounterTest.java
 *
 * Unit tests for the DigitCounter class.
 */

 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;
 
 public class DigitCounterTest {
 
     @Test
     void testZero() {
         assertEquals(1, DigitCounter.countDigits(0), "0 should have 1 digit");
     }
 
     @Test
     void testPositiveNumber() {
         assertEquals(2, DigitCounter.countDigits(34));
         assertEquals(6, DigitCounter.countDigits(100000));
         assertEquals(1, DigitCounter.countDigits(7));
     }
 
     @Test
     void testNegativeNumber() {
         assertEquals(4, DigitCounter.countDigits(-7291));
         assertEquals(1, DigitCounter.countDigits(-1));
     }
 
     @Test
     void testLargeInteger() {
         assertEquals(10, DigitCounter.countDigits(2147483647));  // Integer.MAX_VALUE
     }
 
     @Test
     void testSmallestInteger() {
         // abs(Integer.MIN_VALUE) is special: still within int range for digit counting
         assertEquals(10, DigitCounter.countDigits(Integer.MIN_VALUE));
     }
 
 }
 
