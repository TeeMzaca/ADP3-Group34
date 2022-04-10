package za.ac.cput.LibrarySystem.repository;

//Author Adrian Bennett 214075982

import za.ac.cput.LibrarySystem.domain.entity.Library;
import za.ac.cput.LibrarySystem.repository.impl.ILibraryRepository;

import java.util.HashSet;
import java.util.Set;

public class LibraryRepository implements ILibraryRepository {
    public static LibraryRepository repository = null;
    private Set<Library> libraryDB = null;


    private LibraryRepository(){ libraryDB = new HashSet<Library>();}

    public static LibraryRepository getRepository(){
        if (repository == null) {
            repository = new LibraryRepository();
        }
        return repository;
    }

    @Override
    public Library create(Library library) {
        boolean success = libraryDB.add(library);
        if (!success)
            return null;
        return library;
    }

    @Override
    public Library update(Library library) {
        Library oldLibrary = read(library.getIdString());
        if (oldLibrary != null) {
            libraryDB.remove(oldLibrary);
            libraryDB.add(library);
            return library;
        }
        return null;
    }

    @Override
    public Library read(String name) {
        Library library = libraryDB.stream()
                .filter(e -> e.getName().equals(name))
                .findAny().orElse(null);
        return library;
    }

    @Override
    public boolean delete(String id) {
        Library libraryDelete = read(id);
        if (libraryDelete == null)
            return false;
        libraryDB.remove(libraryDelete);
        return true;
    }

    @Override
    public Set<Library> getAll() {
        return libraryDB;
    }



}