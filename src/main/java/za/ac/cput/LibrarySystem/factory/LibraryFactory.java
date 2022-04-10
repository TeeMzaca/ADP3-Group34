//Autho Adrian Bennett 214075982

package za.ac.cput.LibrarySystem.factory;

import za.co.cput.LibrarySystem.domain.entity.Library;
import za.co.cput.LibrarySystem.util.Helper;



public class LibraryFactory {
    public static void Librarian createLibrarian(int id, String name, String address) {


        if (Helper.isNullorEmpty(id)|| Helper.isNullorEmpty(name)|| Helper.isNullorEmpty(address)|| )

            return new Library.Builder().setId(id)
                    .setName(name)
                    .setAddress(address)
                    .build();

    }


    }

}