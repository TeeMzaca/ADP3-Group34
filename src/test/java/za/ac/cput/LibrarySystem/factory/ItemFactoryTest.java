package za.ac.cput.LibrarySystem.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.LibrarySystem.domain.entity.Item;

import static org.junit.jupiter.api.Assertions.*;

class ItemFactoryTest {
    @Test
    public void test(){
        Item item = ItemFactory.createItem(
                "AHFD1243",
                "Book",
                null,
                null,
                0,
                "English"
        );
        assertNotNull(item);
        System.out.println(item);
    }


}