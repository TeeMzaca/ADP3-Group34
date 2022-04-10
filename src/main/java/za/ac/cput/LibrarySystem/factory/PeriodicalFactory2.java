package za.ac.cput.LibrarySystem.factory;
/*
        Periodical Factory
        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import za.ac.cput.LibrarySystem.domain.entity.Periodical;

public class PeriodicalFactory2 {
    public static Periodical createPeriodical(Integer id, String title, Integer numberOfPages,String releaseDate, String genre, String description){

        if(id.equals("")){
           return null;
        }

        if(title.equals("")){
            return null;
        }

        if(releaseDate.equals("")){
            return null;
        }
        if(genre.equals("")){
            return null;
        }
        if(numberOfPages.equals("")){
            return null;
        }


        return new Periodical.Builder()
                .setId(id)
                .setTitle(title)
                .setGendre(genre)
                .setDescription(description)
                .setNumberOfPages(numberOfPages)
                .setReleaseDate(releaseDate)
                .build();
    }
}
