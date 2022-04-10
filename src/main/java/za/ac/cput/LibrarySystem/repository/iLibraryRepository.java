package za.ac.cput.LibrarySystem.repository;
/*
    Student: Adrian Bennett 210475982
    Date: 10 April 2022
 */
import za.ac.cput.LibrarySystem.domain.entity.Library;
import java.util.Set;

public interface ILibraryRepository extends IRepository<Library, String>{
    Set<Library> getAll();

}
