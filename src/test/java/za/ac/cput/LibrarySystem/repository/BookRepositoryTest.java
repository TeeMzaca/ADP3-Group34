package za.ac.cput.LibrarySystem.repository;
/*
    BookRepositoryTest.java
    Test Repository Entity for Book
    Student: Lana Africa (216166640)
    Date: 9 April 2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.LibrarySystem.domain.entity.Book;
import za.ac.cput.LibrarySystem.factory.BookFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BookRepositoryTest {
    private static BookRepository repository = BookRepository.getRepository();
    private static Book book = BookFactory.createBook("1125", "Java: Beginner's Guide","McGraw-Hill Education", "2018-11-02",80f,720);

    @Test
    void a_create() {
        Book created = repository.create(book);
        assertEquals(book.getIsbn(),created.getIsbn());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Book read = repository.read(book.getIsbn());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Book updated = new Book.Builder().copy(book).setNumberOfPages(800)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(book.getIsbn());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}