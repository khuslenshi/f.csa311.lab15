package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverseSingleChar() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void reverseAsciiString() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void reverseNullReturnsNull() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void capitalizeNormal() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    void capitalizeEmpty() {
        assertEquals("", StringUtils.capitalize(""));
    }

    @Test
    void capitalizeNull() {
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    void isBlankTrue() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    void isBlankFalse() {
        assertFalse(StringUtils.isBlank("hi"));
    }

    @Test
    void isBlankNull() {
        assertTrue(StringUtils.isBlank(null));
    }
}
