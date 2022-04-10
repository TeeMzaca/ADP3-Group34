package za.ac.cput.LibrarySystem.factory;
/*
        MusicAlbumFactory.java
        MusicAlbum Factory
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 9 April 2022
 */

import za.ac.cput.LibrarySystem.domain.entity.MusicAlbum;
import za.ac.cput.LibrarySystem.util.Helper;

public class MusicAlbumFactory {

    public static MusicAlbum createAlbum(Integer id, String title, String publisher, String publicationDate, Float value, Integer timeLength){
        if(Helper.isNullorEmpty(title) || Helper.isNullorEmpty(publisher) || Helper.isNullorEmpty(publicationDate)){
            return null;
        }

        if (id == null){
            return null;
        }
        if (value == null){
            return null;
        }
        if (timeLength == null){
            return null;
        }
        return new MusicAlbum.Builder(id)
                .Title(title)
                .Publisher(publisher)
                .publicationDate(publicationDate)
                .Value(value)
                .timeLength(timeLength)
                .build();

    }
}
