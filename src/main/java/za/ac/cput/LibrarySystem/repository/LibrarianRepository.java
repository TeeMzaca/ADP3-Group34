package za.ac.cput.LibrarySystem.repository;

//Author Adrian Bennett 214075982

import za.ac.cput.LibrarySystem.domain.entity.Librarian;
import java.util.HashSet;
import java.util.Set;

public class LibrarianRepository implements ILibrarianRepository {
    public static LibrarianRepositoryrepository = null;
    private Set<Librarian> librarianDB = null;


    private LibrarianRepository(){ librarianDB = new HashSet<Librarian>();}

    public static LibrarianRepository getRepository(){
        if (repository == null) {
            repository = new LibrarianRepository();
        }
        return repository;
    }

    @Override
    public Library create(Librarian librarian) {
        boolean success = librarianDB.add(librarian);
        if (!success)
            return null;
        return librarian;
    }

    @Override
    public Librarian update(Librarian librarian) {
        Librarian oldBio = read(librarian.getBio());
        if (oldBio != null) {
            librarianDB.remove(oldBio);
            librarianDB.add(librarian);
            return librarian;
        }
        return null;
    }


    @Override
    public Librarian read(String id) {
        Librarian librarian = librarianDB.stream()
                .filter(e -> e.getId().equals(id))
                .findAny().orElse(null);
        return librarian;
    }

    @Override
    public boolean delete(String id) {
        Librarian librarianDelete = read(id);
        if (librarianDelete == null)
            return false;
        librarianDB.remove(librarianDelete);
        return true;
    }

    @Override
    public Set<Librarian> getAll() {
        return librarianDB;
    }

}