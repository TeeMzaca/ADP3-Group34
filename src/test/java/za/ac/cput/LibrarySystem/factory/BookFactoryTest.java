package za.ac.cput.LibrarySystem.factory;

/*
        BookFactoryTest.java
        Factory Test for Book Entity
        Student: Lana Africa (216166640)
        Date: 7 April 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.LibrarySystem.domain.entity.Book;
import static org.junit.jupiter.api.Assertions.*;

class BookFactoryTest {
    @Test
    public void test(){
        Book book = BookFactory.createBook("1125", "Java: Beginner's Guide", "McGraw-Hill Education", "12-02-2002", 80f, 720);
        assertNotNull(book);
        System.out.println(book);
    }

}