//Ethan Christopher Swart 220126283
package za.ac.cput.LibrarySystem.repository;

/*
    AccountRepository.java
    Student: Ethan Swart (220126283)
 */

import za.ac.cput.LibrarySystem.domain.entity.Account;
import za.ac.cput.LibrarySystem.repository.impl.IAccountRepository;

import java.util.HashSet;
import java.util.Set;

public class AccountRepository implements IAccountRepository {

    public static AccountRepository repository = null;
    private Set<Account> accountDB = null;
    private AccountRepository(){ accountDB = new HashSet<Account>();}

    //GetRepository method
    public static AccountRepository getRepository(){
        if (repository == null) {
            repository = new AccountRepository();
        }
        return repository;
    }

    //Create method
    @Override
    public Account create(Account account) {
        boolean success = accountDB.add(account);
        if (!success) {
            return null;
        }
        return account;
    }

    //Read method
    @Override
    public Account read(String id) {
        Account account = accountDB.stream()
                .filter(e -> e.getIDString().equals(id))
                .findAny().orElse(null);
        return account;
    }

    //Update method
    @Override
    public Account update(Account account) {
        Account oldAccount = read(account.getIDString());
        if (oldAccount != null) {
            accountDB.remove(oldAccount);
            accountDB.add(account);
            return account;
        }
        return null;
    }

    //Delete method
    @Override
    public boolean delete(String id) {
        Account accountDelete = read(id);
        if (accountDelete == null)
            return false;
        accountDB.remove(accountDelete);
        return true;
    }

    //GetAll method
    @Override
    public Set<Account> getAll() {
        return accountDB;
    }
}
