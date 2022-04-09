package za.ac.cput.LibrarySystem.factory;
/*
        AuthorFactory.java
        Author Factory
        Student: Lana Africa (216166640)
        Date: 7 April 2022
*/
import za.ac.cput.LibrarySystem.domain.entity.Author;
import za.ac.cput.LibrarySystem.util.Helper;


public class AuthorFactory {

    public static Author createAuthor(Integer id, String name, String birthDate, String bio){
        if(Helper.isNullorEmpty(name) ||
                Helper.isNullorEmpty(birthDate) ||
                Helper.isNullorEmpty(bio)){
            return null;
        }
        if (id == null){
            return null;
        }

        return new Author.Builder()
                .setID(id)
                .setName(name)
                .setBirthDate(birthDate)
                .setBio(bio)
                .build();
    }
}