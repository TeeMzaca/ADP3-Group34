//Author Adrian Bennett 21475982
package za.ac.cput.LibrarySystem.factory;

import za.co.cput.LibrarySystem.domain.entity.Librarian;
import za.co.cput.LibrarySystem.util.Helper;



public class LibrarianFactory {

    public static void Librarian createLibrarian(int id, String firstName, String lastName, date dob, String homeAdress) {
        if (Helper.isNullorEmpty(firstName)|| Helper.isNullorEmpty(lastName)||  Helper.isNullorEmpty(dob)|| Helper.isNullorEmpty(homeAdress)||)

        return new Librarian.Builder().setFirstName(firstName)
                .setLastName(lastName)
                .setDob(dob)
                .setHomeAddress(homeAddress)
                .build();

    }

}