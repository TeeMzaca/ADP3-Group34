//Author Adrian Bennett 214075982

package za.ac.cput.LibrarySystem.factory;

import za.ac.cput.LibrarySystem.domain.entity.Library;
import za.ac.cput.LibrarySystem.util.Helper;



public class LibraryFactory {
    public static Library createLibrarian(int id, String name, String address) {


        if (Helper.isNullorEmpty(String.valueOf(id))|| Helper.isNullorEmpty(name)|| Helper.isNullorEmpty(address))
            return new Library.Builder().setId(id)
                    .setName(name)
                    .setAddress(address)
                    .build();

        return null;
    }


}
