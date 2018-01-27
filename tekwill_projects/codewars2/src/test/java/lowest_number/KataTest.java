package lowest_number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void BasicTest() {
        assertEquals(16, Kata.sum(new int[]{6, 2, 1, 8, 10}));
    }

    @Test
    public void BasicOtherTest() {
        assertEquals(6, Kata.sum(new int[]{1, 1, 11, 2, 3}));
    }
    @Test
    public void MyTest() {
        assertEquals(21, Kata.sum(new int[]{9, 4, 53, 5, 7}));
    }
}