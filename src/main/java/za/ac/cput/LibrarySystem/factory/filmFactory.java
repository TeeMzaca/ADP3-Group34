package za.ac.cput.LibrarySystem.factory;

import za.ac.cput.LibrarySystem.domain.entity.Film;

public class filmFactory {
    //creating film objects
    public static Film createFilm(String id, String title, String releaseDate) {

        //title validation
        if(title.equals("") || title == null)
            return null;

        return new Film.Builder().setId(id)
                .setTitle(title)
                .setReleaseDate(releaseDate)
                .build();
    }
}
