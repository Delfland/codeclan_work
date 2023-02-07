import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTests {

    private Book book;

    @Before
    public void before(){
        book = new Book("To Kill a Mockingbird", "Harper Lee", "novel");
    }

    @Test
    public void bookHasAGenre() {
        assertEquals("novel", book.getGenre());
    }
}
