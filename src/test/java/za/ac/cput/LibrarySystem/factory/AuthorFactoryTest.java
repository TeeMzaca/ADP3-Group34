package za.ac.cput.LibrarySystem.factory;

/*
        AuthorFactoryTest.java
        Factory Test for Author Entity
        Student: Lana Africa (216166640)
        Date: 7 April 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.LibrarySystem.domain.entity.Author;
import static org.junit.jupiter.api.Assertions.*;

class AuthorFactoryTest {
    @Test
    public void test(){
        Author author = AuthorFactory.createAuthor( 1, "Herbert", "1951-28-02", "Well known author");
        assertNotNull(author);
        System.out.println(author);
    }


}