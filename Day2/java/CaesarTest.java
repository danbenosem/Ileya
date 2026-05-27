import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarTest{

    @Test
    public void testThatItReturnsCorrectOutput() {
        
        String actual = Caesar.encryptedText("CALL", 3);
        assertEquals("FDOO", actual);
    }

    @Test
    public void testThatTeLastLetterInAlphabetWorksCorrectlyForUpperCase() {
        
        String actual = Caesar.encryptedText("XYZ", 3);
        assertEquals("ABC", actual);
    }

    @Test
public void testThatTeLastLetterInAlphabetWorksCorrectlyForLowerCase(){
        
        String actual = Caesar.encryptedText("xyz", 3);
        assertEquals("abc", actual);
    }

    @Test
    public void testMixedCase() {
        String actual = Caesar.encryptedText("CallZ", 3);
        assertEquals("FdooC", actual);
    }

    @Test
    public void testZeroShift() {
       
        String actual = Caesar.encryptedText("Hello", 0);
        assertEquals("Hello", actual);
    }
}

