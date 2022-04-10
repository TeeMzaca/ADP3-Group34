//Ethan Christopher Swart 220126283
package za.ac.cput.LibrarySystem.repository.impl;

/*
    IAccountRepository.java
    Student: Ethan Swart (220126283)
 */

import za.ac.cput.LibrarySystem.domain.entity.Account;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

public interface IAccountRepository extends IRepository<Account, String> {
    Set<Account> getAll();
}
