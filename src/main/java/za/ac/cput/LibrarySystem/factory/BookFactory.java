package za.ac.cput.LibrarySystem.factory;
/*
        BookFactory.java
        Book Factory
        Student: Lana Africa (216166640)
        Date: 7 April 2022
*/
import za.ac.cput.LibrarySystem.domain.entity.Book;
import za.ac.cput.LibrarySystem.util.Helper;

public class BookFactory {
    public static Book createBook(String isbn, String title, String publisher, String publicationDate, Float value, Integer numberOfPages){
        if(Helper.isNullorEmpty(isbn) || Helper.isNullorEmpty(title) || Helper.isNullorEmpty(publicationDate)){
            return null;
        }

        if (value == null){
            return null;
        }
        if (numberOfPages == null){
            return null;
        }
        return new Book.Builder()
                .setIsbn(isbn)
                .setTitle(title)
                .setPublisher(publisher)
                .setPublicationDate(publicationDate)
                .setValue(value)
                .setNumberOfPages(numberOfPages)
                .build();

    }
}
