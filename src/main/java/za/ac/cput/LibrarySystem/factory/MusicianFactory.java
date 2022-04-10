package za.ac.cput.LibrarySystem.factory;
/*
        MusicianFactory.java
        Musician Factory
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 9 April 2022
 */

import za.ac.cput.LibrarySystem.domain.entity.Musician;
import za.ac.cput.LibrarySystem.util.Helper;

public class MusicianFactory {

    public static Muscian createMusician(Integer id, String name, String birthDate, String bio){
        
        if(Helper.isNullorEmpty(name) || Helper.isNullorEmpty(birthDate) || Helper.isNullorEmpty(bio)){
            return null;
        }
        if (id == null){
            return null;
        }

        return new Musician.Builder()
                .setID(id)
                .setName(name)
                .setBirthDate(birthDate)
                .setBio(bio)
                .build();
    }
}
