import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeConverterTest {

    // Test case with a valid large number of seconds
    @Test
    void testValidConversion() {
        // 21893872 seconds is equivalent to 253 days, 9 hours, 37 minutes, and 52 seconds
        assertEquals("253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)",
            TimeConverter.convertSecondsToTime(21893872));
    }

    // Test case with zero seconds
    @Test
    void testZeroSeconds() {
        // 0 seconds should return 0 days, 0 hours, 0 minutes, and 0 seconds
        assertEquals("0 Day(s) 0 Hour(s) 0 Minute(s) 0 Second(s)",
            TimeConverter.convertSecondsToTime(0));
    }

    // Test case with negative input for seconds
    @Test
    void testNegativeInput() {
        // Negative seconds should return an error message indicating invalid input
        assertEquals("Invalid input: seconds cannot be negative.",
            TimeConverter.convertSecondsToTime(-100));
    }

    // Test case with exactly one full day (86400 seconds)
    @Test
    void testOneDayExactly() {
        // 86400 seconds is exactly 1 day, 0 hours, 0 minutes, and 0 seconds
        assertEquals("1 Day(s) 0 Hour(s) 0 Minute(s) 0 Second(s)",
            TimeConverter.convertSecondsToTime(86400));
    }

    // Test case with 1 minute and 1 second (61 seconds)
    @Test
    void testOneMinuteOneSecond() {
        // 61 seconds is equivalent to 0 days, 0 hours, 1 minute, and 1 second
        assertEquals("0 Day(s) 0 Hour(s) 1 Minute(s) 1 Second(s)",
            TimeConverter.convertSecondsToTime(61));
    }
}
