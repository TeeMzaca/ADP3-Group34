//Ethan Christopher Swart 220126283
package za.ac.cput.LibrarySystem.repository;

/*
    ItemRepository.java
    Student: Ethan Swart (220126283)
 */

import za.ac.cput.LibrarySystem.domain.entity.Item;
import za.ac.cput.LibrarySystem.repository.impl.IItemRepository;

import java.util.HashSet;
import java.util.Set;

public class ItemRepository implements IItemRepository {

    public static ItemRepository repository = null;
    private Set<Item> itemDB = null;
    private ItemRepository(){ itemDB = new HashSet<Item>();}

    //GetRepository method
    public static ItemRepository getRepository(){
        if (repository == null) {
            repository = new ItemRepository();
        }
        return repository;
    }

    //Create method
    @Override
    public Item create(Item item) {
        boolean success = itemDB.add(item);
        if (!success) {
            return null;
        }
        return item;
    }

    //Read method
    @Override
    public Item read(String barcode) {
        Item item = itemDB.stream()
                .filter(e -> e.getBarcode().equals(barcode))
                .findAny().orElse(null);
        return item;
    }

    //Update method
    @Override
    public Item update(Item item) {
        Item oldItem = read(item.getBarcode());
        if (oldItem != null) {
            itemDB.remove(oldItem);
            itemDB.add(item);
            return item;
        }
        return null;
    }

    //Delete method
    @Override
    public boolean delete(String barcode) {
        Item itemDelete = read(barcode);
        if (itemDelete == null)
            return false;
        itemDB.remove(itemDelete);
        return true;
    }

    //GetAll method
    @Override
    public Set<Item> getAll() {
        return itemDB;
    }
}
