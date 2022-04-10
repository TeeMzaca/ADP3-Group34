package za.ac.cput.LibrarySystem.factory;

import za.ac.cput.LibrarySystem.domain.entity.Director;

public class directorFactory {
    //creating director objects
    public static Director createDirector(Integer id, String firstName, String lastName){
        return new Director.Builder().setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }

}
