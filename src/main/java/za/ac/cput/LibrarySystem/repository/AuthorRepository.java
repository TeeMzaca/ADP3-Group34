package za.ac.cput.LibrarySystem.repository;
 /*
    AuthorRepository.java
    Repository Entity for Author
    Student: Lana Africa (216166640)
    Date: 9 April 2022
 */

import za.ac.cput.LibrarySystem.domain.entity.Author;
import za.ac.cput.LibrarySystem.repository.impl.IAuthorRepository;

import java.util.HashSet;
import java.util.Set;

public class AuthorRepository implements IAuthorRepository {
    public static AuthorRepository repository = null;
    private Set<Author> authorDB = null;

    private AuthorRepository(){ authorDB = new HashSet<Author>();}

    public static AuthorRepository getRepository(){
        if (repository == null) {
            repository = new AuthorRepository();
        }
        return repository;
    }

    @Override
    public Author create(Author author) {
        boolean success = authorDB.add(author);
        if (!success)
            return null;
        return author;
    }

    @Override
    public Author read(String bio) {
        Author author = authorDB.stream()
                .filter(e -> e.getBio().equals(bio))
                .findAny().orElse(null);
        return author;
    }

    @Override
    public Author update(Author author) {
        Author oldBio = read(author.getBio());
        if (oldBio != null) {
            authorDB.remove(oldBio);
            authorDB.add(author);
            return author;
        }
        return null;
    }

    @Override
    public boolean delete(String bio) {
        Author authorDelete = read(bio);
        if (authorDelete == null)
            return false;
        authorDB.remove(authorDelete);
        return true;
    }

    @Override
    public Set<Author> getAll() {
        return authorDB;
    }
}
