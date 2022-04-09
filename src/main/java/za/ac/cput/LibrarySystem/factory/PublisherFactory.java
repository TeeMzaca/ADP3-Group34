package za.ac.cput.LibrarySystem.factory;

import za.ac.cput.LibrarySystem.domain.entity.Publisher;
import za.ac.cput.LibrarySystem.util.Helper;



public class PublisherFactory {
    public static Publisher createBook(String id, String companyName, String bio, String startDate){

        if(Helper.isNullorEmpty(id) || Helper.isNullorEmpty(companyName) ||Helper.isNullorEmpty(bio)|| Helper.isNullorEmpty(startDate)){
            return null;
        }

        if (bio == null){
            return null;
        }
        if (startDate == null){
            return null;
        }
        return new Publisher.Builder()
                .setId(id)
                .setCompanyName(companyName)
                .setBio(bio)
                .setStartDate(startDate)
                .build();

    }


    }

