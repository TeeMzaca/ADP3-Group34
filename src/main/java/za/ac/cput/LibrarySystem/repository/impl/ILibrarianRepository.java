package za.ac.cput.LibrarySystem.repository.impl;
/*

    Student: Adrian Bennett 210475982
    Date: 10 April 2022
 */
import za.ac.cput.LibrarySystem.domain.entity.Librarian;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

public interface ILibrarianRepository extends IRepository<Librarian, String> {
    Set<Librarian> getAll();

}
