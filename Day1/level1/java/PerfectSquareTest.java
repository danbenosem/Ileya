import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class PerfectSquareTest {

    @Test
    public void testThatItReturnsTheRightValues() {
           int[] array = {4,9,16,20};
        int[] expected = {4,9,16};
        assertArrayEquals(expected, PerfectSquare.array(array));
    }


  @Test


 public void testThatItReturnsEmptyArray(){

          int[] array = {10,20};
        int[] expected = {};
       assertArrayEquals(expected, PerfectSquare.array(array));



   }

















}
