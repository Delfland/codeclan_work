import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTests {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library("Delph's Book Emporium", 2);
        book1 = new Book("To Kill a Mockingbird", "Harper Lee", "novel");
        book2 = new Book("Agent 6", "Tom Rob Smith", "novel");
        book3 = new Book("The Gruffalo", "Julia Donaldson", "picture book");
        borrower = new Borrower("Paul");

    }

    @Test
    public void libraryStartsWithEmptyStock(){
        assertEquals(0, library.getStockCount());
    }

    @Test
    public void libraryCanAddBooksToStock(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getStockCount());
    }

    @Test
    public void libraryCanCheckIfFull(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(true, library.checkIfFull());
    }

    @Test
    public void libraryCanCheckIfNotFull(){
        library.addBook(book1);
        assertEquals(false, library.checkIfFull());
    }

    @Test
    public void libraryCannotAddBooksToStockIfFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getStockCount());
    }

    @Test
    public void libraryCanRemoveBooksFromStock() {
        library.addBook(book1);
        library.addBook(book2);
        library.remove(book1);
        assertEquals(1, library.getStockCount());
    }

    @Test
    public void libraryCanLendABookToALender() {
        library.addBook(book1);
        library.addBook(book2);
        library.lend(book1, borrower);
        assertEquals(1, library.getStockCount());
        assertEquals(1, borrower.checkBorrowedBooks());
    }

    @Test
    public void libraryCanTrackNumberOfBooksByGenre() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getGenreCount("novel"));
    }

}
