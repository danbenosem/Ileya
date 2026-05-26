import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class MoreOnceTest {

    @Test
    public void testThatItReturnsTheRightValues() {
           int[] array = {1,2,3,2,4,3};
        int[]expected = {2,3};
        assertArrayEquals(expected, MoreOnce.array(array));
    }





 @Test
    void testNegativeNumbers() {
        int[] array = {-5, -4, 2,-4,-5};
        int[] expected = {-5,-4};
  assertArrayEquals(expected, MoreOnce.array(array));
    }













}
