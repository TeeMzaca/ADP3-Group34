package za.ac.cput.LibrarySystem.repository;
/*
    IBookRepository.java
    Interface for Book Repository
    Student: Lana Africa (216166640)
    Date: 9 April 2022
 */

import za.ac.cput.LibrarySystem.domain.entity.Book;
import java.util.Set;

public interface IBookRepository extends IRepository<Book, String>{
    Set<Book> getAll();
}
