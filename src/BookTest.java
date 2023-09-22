import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBookConstructorAndAccessors() {
        String title = "Book Title";
        String author = "Author Name";
        String isbn = "ISBN12345";
        int year = 2022;

        Book book = new Book(title, author, isbn, year);

        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(isbn, book.getIsbn());
        assertEquals(year, book.getYear());
    }

    @Test
    public void testToStringMethod() {
        String title = "Book Title";
        String author = "Author Name";
        String isbn = "ISBN12345";
        int year = 2022;

        Book book = new Book(title, author, isbn, year);

        String expectedString = "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\nYear: " + year + "\n";
        assertEquals(expectedString, book.toString());
    }
}
