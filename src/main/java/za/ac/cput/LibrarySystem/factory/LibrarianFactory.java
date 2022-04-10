//Author Adrian Bennett 21475982
package za.ac.cput.LibrarySystem.factory;

import za.ac.cput.LibrarySystem.domain.entity.Librarian;
import za.ac.cput.LibrarySystem.util.Helper;



public class LibrarianFactory {

    public static Librarian createLibrarian(int id, String firstName, String lastName, String dob, String homeAddress) {
        if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName) || Helper.isNullorEmpty(dob) || Helper.isNullorEmpty(homeAddress)) {
            return new Librarian.Builder().setFirstName(firstName)
                    .setLastName(lastName)
                    .setDob(dob)
                    .setHomeAddress(homeAddress)
                    .build();
        }

        return null;
    }

}