//File Descriptor    : directorFactory.java
//Program Descriptor : This is a director Factory
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022

package za.ac.cput.LibrarySystem.factory;

import za.ac.cput.LibrarySystem.domain.entity.Director;

public class directorFactory {
    //creating director objects
    public static Director createDirector(String id, String firstName, String lastName){

        //firstName and lastName validation (evaluation)
        if(firstName.equals("") || firstName == null)
            return null;
        if(firstName.isEmpty() || firstName == null)
            return null;

        if(lastName.equals("") || lastName == null)
            return null;
        if(lastName.isEmpty() || lastName == null)
            return null;
        /**
        //short-circuit evaluation
        if(Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName))
            return null;
        */
        return new Director.Builder().setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }

}
