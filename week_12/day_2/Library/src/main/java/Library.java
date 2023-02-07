import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Library {

    private String name;
    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> genres;

    public Library(String name, int capacity) {
        this.name = name;
        this.books = new ArrayList<>();
        this.capacity = capacity;
        this.genres = new HashMap<>();
    }

    public int getStockCount() {
        return books.size();
    }

    public void addBook(Book book) {
        if (!this.checkIfFull()) {
            this.books.add(book);
            String bookGenre = book.getGenre();
            for (String newGenre : this.genres.keySet()) {
                if (Objects.equals(newGenre, bookGenre)) {
                    int genreValue = this.genres.get(newGenre);
                    int newGenreValue = genreValue + 1;
                    this.genres.replace(newGenre, genreValue, newGenreValue);
                } else {
                    this.genres.put(bookGenre, 1);
                }
            }
        }
    }

    public boolean checkIfFull() {
        return this.books.size() == this.capacity;
    }

    public void remove(Book book) {
        this.books.remove(book);
    }

    public void lend(Book book, Borrower borrower) {
        this.books.remove(book);
        borrower.borrow(book);
    }

    public int getGenreCount(String genre) {
        return this.genres.get(genre);
    }
}
