package za.ac.cput.LibrarySystem.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.LibrarySystem.domain.entity.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountFactoryTest {
    @Test
    public void test(){
        Account account = AccountFactory.createAccount(
                1,
                "James",
                "Gnash",
                "1991-21-03",
                "123 Green Street",
                "2010-03-06",
                "Open");
        assertNotNull(account);
        System.out.println(account);
    }

}