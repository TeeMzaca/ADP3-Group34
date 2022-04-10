package za.ac.cput.LibrarySystem.factory;
/*
        Publisher Factory
        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/

import za.ac.cput.LibrarySystem.domain.entity.Publisher;

public class PublisherFactory {
    public static Publisher createPublisher(Integer id, String companyName, String bio, String startDate){

        if(id.equals("")){
            return null;
        }

        if(companyName.equals("")){
            return null;
        }

        if(bio.equals("")){
            return null;
        }
        if(startDate.equals("")){
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

