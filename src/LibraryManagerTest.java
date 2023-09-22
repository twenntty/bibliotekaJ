import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryManagerTest {

    @Test
    public void testLibraryManagerOperations() {

        Library library = new Library();

        library.addBook(new Book("Book 1", "Author 1", "ISBN1", 2020));
        library.addBook(new Book("Book 2", "Author 2", "ISBN2", 2019));

        String searchTitle = "Book 1";
        Book foundBook = library.findBookByTitle(searchTitle);
        assertNotNull(foundBook);
        assertEquals(searchTitle, foundBook.getTitle());

        String isbnToDelete = "ISBN2";
        boolean isDeleted = library.removeBookByIsbn(isbnToDelete);
        assertTrue(isDeleted);
        assertNull(library.findBookByTitle("Book 2"));
    }
}
