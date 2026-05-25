import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class PerfectReplacementTest {

    @Test
    public void testThatItReturnsTheRightValues() {
           int[] array = {4,9,16,20};
        int[] expected = {4,9,16,-1};
        assertArrayEquals(expected, PerfectReplacement.array(array));
    }


  @Test


 public void testThatItReturnsAllNegativeArray(){

          int[] array = {10,20};
        int[] expected = {-1,-1};
       assertArrayEquals(expected, PerfectReplacement.array(array));



   }

















}
