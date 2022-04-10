package za.ac.cput.LibrarySystem.repository.impl;
/*
    IBookRepository.java
    Interface for Book Repository
    Student: Lana Africa (216166640)
    Date: 9 April 2022
 */

import za.ac.cput.LibrarySystem.domain.entity.Book;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

public interface IBookRepository extends IRepository<Book, String> {
    Set<Book> getAll();
}
