//Ethan Christopher Swart 220126283
package za.ac.cput.LibrarySystem.repository.impl;

/*
    IItemRepository.java
    Student: Ethan Swart (220126283)
 */

import za.ac.cput.LibrarySystem.domain.entity.Item;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

public interface IItemRepository extends IRepository<Item, String> {
    Set<Item> getAll();
}
