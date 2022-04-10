package za.ac.cput.LibrarySystem.repository;
/*
    AuthorRepositoryTest
    Test Repository Entity for Author
    Student: Lana Africa (216166640)
    Date: 9 April 2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.LibrarySystem.domain.entity.Author;
import za.ac.cput.LibrarySystem.factory.AuthorFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AuthorRepositoryTest {
    private static AuthorRepository repository = AuthorRepository.getRepository();
    private static Author author = AuthorFactory.createAuthor(1, "Hebert", "1951-28-02", "Well known author");

    @Test
    void a_create() {
        Author created = repository.create(author);
        assertEquals(author.getId(), created.getId());
        System.out.println("Created:" + created);
    }

    @Test
    void b_read() {
        Author read = repository.read(author.getBio());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Author updated = new Author.Builder().copy(author).setBirthDate("2002-02-02")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(author.getBio());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}