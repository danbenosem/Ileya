import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class BookingSystemTest {



    @Test
    public void ChecksuggestBooksThatItReturnsSomething(){
    
    String result = BookingSystem.title();
    assertNotNull(result);


  }



    @Test
    public void ChecksuggestBooksThatItContentisNotJustQuotaionMarks(){
    
    String result = BookingSystem.title();
    assertFalse(result.isEmpty());


  }

  @Test
    public void CheckThatItConTainsTextCharacter(){
    
    String result = BookingSystem.title();
    assertTrue(result.length()>0);


  }











}
