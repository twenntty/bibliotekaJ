import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBookAndDisplayBooks() {
        Library library = new Library();
        Book book1 = new Book("Book 1", "Author 1", "ISBN1", 2020);
        Book book2 = new Book("Book 2", "Author 2", "ISBN2", 2019);

        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testFindBookByTitle() {
        Library library = new Library();
        Book book1 = new Book("Book 1", "Author 1", "ISBN1", 2020);
        Book book2 = new Book("Book 2", "Author 2", "ISBN2", 2019);

        library.addBook(book1);
        library.addBook(book2);

        Book foundBook = library.findBookByTitle("Book 1");

        assertNotNull(foundBook);
        assertEquals("Book 1", foundBook.getTitle());
    }

    @Test
    public void testRemoveBookByIsbn() {
        Library library = new Library();
        Book book1 = new Book("Book 1", "Author 1", "ISBN1", 2020);
        Book book2 = new Book("Book 2", "Author 2", "ISBN2", 2019);

        library.addBook(book1);
        library.addBook(book2);

        assertTrue(library.removeBookByIsbn("ISBN2"));
        assertNull(library.findBookByTitle("Book 2"));
        assertEquals(1, library.getBooks().size());
    }
}
