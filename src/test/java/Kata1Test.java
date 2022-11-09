import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Kata1Test {
    @Test
    public void testSomething() {
        assertEquals(6, Kata1.grow(new int[]{1,2,3}));
        assertEquals(16, Kata1.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, Kata1.grow(new int[]{2,2,2,2,2,2}));
    }

    @Test
    public void testMultiply() {
        assertEquals(32, Kata1.grow(new int[]{2,2,2,2,2}));
    }
}