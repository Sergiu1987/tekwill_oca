package remove_space_from_string;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void BasicTest() {
        assertEquals("fhdhdhdhhfggr", Kata.noSpace("fhdhdhdh    hfggr"));
    }
    @Test
    public void SecondBasicTest() {
        assertEquals("griveicateltarcat", Kata.noSpace("grivei catel tarcat"));
    }
    @Test
    public void ThirdBasicTest() {
        assertEquals("George", Kata.noSpace("G e o r g e"));
    }
}