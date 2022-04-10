package za.ac.cput.LibrarySystem.repository;
/*
    IAuthorRepository.java
    Interface for Author Repository
    Student: Lana Africa (216166640)
    Date: 9 April 2022
 */
import za.ac.cput.LibrarySystem.domain.entity.Author;
import java.util.Set;

public interface IAuthorRepository extends IRepository<Author, String>{
    Set<Author> getAll();

}
