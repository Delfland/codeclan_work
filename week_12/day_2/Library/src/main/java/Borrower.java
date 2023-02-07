import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int checkBorrowedBooks() {
        return borrowedBooks.size();
    }

    public void borrow(Book book) {
        borrowedBooks.add(book);
    }
}
