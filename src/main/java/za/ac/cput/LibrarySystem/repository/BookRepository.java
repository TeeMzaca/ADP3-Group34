package za.ac.cput.LibrarySystem.repository;
/*
    BookRepository.java
    Repository Entity for Book
    Student: Lana Africa (216166640)
    Date: 9 April 2022
 */

import za.ac.cput.LibrarySystem.domain.entity.Book;
import za.ac.cput.LibrarySystem.repository.impl.IBookRepository;

import java.util.HashSet;
import java.util.Set;

public class BookRepository implements IBookRepository {
    public static BookRepository repository = null;
    private Set<Book> bookDB = null;

    private  BookRepository() { bookDB = new HashSet<Book>();}

    public static BookRepository getRepository(){
        if (repository == null){
            repository = new BookRepository();
        }
        return repository;
    }

    @Override
    public Book create(Book book){
        boolean success = bookDB.add(book);
        if (!success)
            return null;
        return book;
    }

    @Override
    public Book read(String isbn){
        Book book = bookDB.stream()
                .filter(e -> e.getIsbn().equals(isbn))
                .findAny().orElse(null);
        return book;
    }

    @Override
    public Book update(Book book) {
        Book oldIsbn = read(book.getIsbn());
        if (oldIsbn != null) {
            bookDB.remove(oldIsbn);
            bookDB.add(book);
            return book;
        }
        return null;
    }

    @Override
    public boolean delete(String isbn) {
        Book bookDelete = read(isbn);
        if(bookDelete == null){
            return false;
        }
        bookDB.remove(bookDelete);
        return true;
    }

    @Override
    public Set<Book> getAll(){
        return bookDB;}
}
