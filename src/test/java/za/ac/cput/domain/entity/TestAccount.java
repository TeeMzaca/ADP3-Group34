//author Ethan Swart 220126283
package za.ac.cput.domain.entity;

import za.ac.cput.LibrarySystem.domain.entity.Account;

//push

public class TestAccount {

    public static void TestBuilder(){

        Account account = new Account.Builder(1)
            .theirFirstName("James")
            .theirLastName("Hardly")
            .theirDOB("1991-10-01")
            .theirHomeAddress("123 Green Road")
            .accountDateOpened("2010-11-12").accountStatus("Open")
            .build();

        System.out.println(account.toString());
    }

}
