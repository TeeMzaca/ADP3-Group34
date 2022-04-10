//Ethan Christopher Swart 220126283
package za.ac.cput.LibrarySystem.factory;

import za.ac.cput.LibrarySystem.domain.entity.Account;
import za.ac.cput.LibrarySystem.util.Helper;

public class AccountFactory {

    //Factory method
    public static Account createAccount(int id, String firstName, String lastName, String dob, String homeAddress, String dateOpened, String status){

        if(Helper.isNullorEmpty(String.valueOf(id)) || Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName)){
            return null;
        }

        return new Account.Builder(id)
                .theirFirstName(firstName)
                .theirLastName(lastName)
                .theirDOB(dob)
                .theirHomeAddress(homeAddress)
                .accountDateOpened(dateOpened)
                .accountStatus(status)
                .build();
    }
}
