import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class MoveZeroTest {

    @Test
    public void testThatItReturnsTheRightValues() {
          int[] array = {5, 0, 3, 0, 2, 0};
        int[]expected = {5,3,2,0,0,0};
        assertArrayEquals(expected, MoveZero.array(array));
    }


















}
