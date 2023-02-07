import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTests {

    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("Paul");
        book = new Book("To Kill a Mockingbird", "Harper Lee", "Novel");
    }

    @Test
    public void borrowerStartsWithNoBorrowedBooks(){
        assertEquals(0, borrower.checkBorrowedBooks());
    }

    @Test
    public void borrowerCanBorrowABook(){
        borrower.borrow(book);
        assertEquals(1, borrower.checkBorrowedBooks());
    }

}
