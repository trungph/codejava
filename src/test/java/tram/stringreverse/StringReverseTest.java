package tram.stringreverse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for String Reverse.
 */
public class StringReverseTest {

    @Test
    public void ReverseString() {
        StringReverse stringReverse = new StringReverse();
        assertEquals("alletS", stringReverse.reverse("Stella"));
        assertEquals("a", stringReverse.reverse("a"));
        assertEquals("", stringReverse.reverse(""));
    }
}
