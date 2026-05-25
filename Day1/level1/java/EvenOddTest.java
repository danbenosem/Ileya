import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class EvenOddTest {

    @Test
    public void testThatItReturnsTheRightValues() {
           int[] array = {45, 60, 3, 10, 9, 22};
        int[][] expected = {{45, 3, 9}, {60, 10, 22}};
        assertArrayEquals(expected, EvenOdd.array(array));
    }


  @Test


 public void testThatItReturnsEvenNumbers(){

          int[] array = {2, 4, 6, 8, 10};
        int[][] expected = {{}, {2,4,6,8,10}};
        assertArrayEquals(expected, EvenOdd.array(array));



   }


   @Test
 public void testThatItReturnsOddNumbers(){

          int[] array = {1, 3, 5, 7, 9};
        int[][] expected = { {1,3,5,7,9},{}};
        assertArrayEquals(expected, EvenOdd.array(array));



   }



 @Test
    void testNegativeNumbers() {
        int[] array = {-5, -4, 2};
        int[][] expected = {{-5}, {-4, 2}};
        assertArrayEquals(expected, EvenOdd.array(array));
    }













}
