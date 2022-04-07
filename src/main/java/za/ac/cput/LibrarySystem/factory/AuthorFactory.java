package za.ac.cput.LibrarySystem.factory;

import za.ac.cput.LibrarySystem.domain.entity.Author;

public class AuthorFactory {

    public static Author createAuthor(Integer id, String name, String birthDate, String bio){
        return new Author.Builder().setID(id)
                .setID(id)
                .setName(name)
                .setBirthDate(birthDate)
                .setBio(bio)
                .build();
    }
}