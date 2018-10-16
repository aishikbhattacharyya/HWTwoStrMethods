import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStrMethodsTest {

    @Test
    public void main() {
    }

    @Test
    public void abcTest1() {
        boolean result = TwoStrMethods.abcTest("123abc");
        assertEquals(true, result);
    }

    public void abcTest2() {
        boolean result = TwoStrMethods.abcTest("123.abc");
        assertEquals(false, result);
    }

    public void abcTest3() {
        boolean result = TwoStrMethods.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void alternateStrings() {
    }
}