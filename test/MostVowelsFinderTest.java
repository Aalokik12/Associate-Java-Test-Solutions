import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the MostVowelsFinder utility
public class MostVowelsFinderTest {

    // Test with a normal array of words
    @Test
    void testWithNormalInput() {
        String[] words = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        // "Resourceful" has the most vowels among the inputs
        assertEquals("Resourceful", MostVowelsFinder.findMostVowels(words));
    }

    // Test with an empty array
    @Test
    void testWithEmptyArray() {
        String[] words = {};
        // Function should return null for empty input
        assertNull(MostVowelsFinder.findMostVowels(words));
    }

    // Test with a null array input
    @Test
    void testWithNullArray() {
        // Should return null if input is null
        assertNull(MostVowelsFinder.findMostVowels(null));
    }

    // Test when two or more words tie in vowel count
    @Test
    void testWithTies() {
        String[] words = {"Abc", "Def", "Iou"};
        // "Iou" has 3 vowels, higher than the others
        assertEquals("Iou", MostVowelsFinder.findMostVowels(words));
    }

    // Test with mixed case input to ensure case insensitivity
    @Test
    void testWithMixedCase() {
        String[] words = {"HELLO", "eLePHant", "zebra"};
        // "eLePHant" has the most vowels and function should treat all cases equally
        assertEquals("eLePHant", MostVowelsFinder.findMostVowels(words));
    }
}
