import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class PalinArrayTest {

    @Test
    public void testThatItReturnsTheRightValues() {
           int[] array = {45, 0, 8, 0, 45 };
        boolean expected = true;
        assertEquals(expected, PalinArray.array(array));
    }


  @Test


 public void testThatItReturnsFalse(){
   int[] array = {45, 0, 8, 0, 49 };
        boolean expected = false;
        assertEquals(expected, PalinArray.array(array));
    }





   


   









}
