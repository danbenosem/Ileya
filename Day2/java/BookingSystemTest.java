import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 

public class BookingSystemTest {

    @Test
    public void checkAddBookReturnsSuccessMessage() {
        
        BookingSystem.books.clear();
        
        String actual= BookingSystem.add("Animal Farm");
        assertEquals("Book added successfully!", actual);
    }

    @Test
    public void checkAddDuplicateBookReturnsAlreadyInListMessage() {
        BookingSystem.books.clear();
        BookingSystem.add("The Hobbit"); 
        
        String actual = BookingSystem.add("The Hobbit"); 
        assertEquals("Book already in the list", actual);
    }

    @Test
    public void checkRemoveBookReturnsSuccessMessage() {
        BookingSystem.books.clear();
        BookingSystem.add("The Mystery"); 
        
        String actual = BookingSystem.remove("The Mystery");
        assertEquals("Book removed successfully!", actual);
    }

    @Test
    public void checkUpdateBookReturnsSuccessMessage() {
        BookingSystem.books.clear();
        BookingSystem.add("The Hobbit"); 
        
        String actual = BookingSystem.update("The Hobbit", "Brave Kingdom");
        assertEquals("Book updated successfully!", actual);
    }

    
}

