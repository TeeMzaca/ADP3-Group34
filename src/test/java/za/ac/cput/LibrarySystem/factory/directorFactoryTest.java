package za.ac.cput.LibrarySystem.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.LibrarySystem.domain.entity.Director;

import static org.junit.jupiter.api.Assertions.*;

//push

class directorFactoryTest {

    @Test
    public void test(){
        Director director = directorFactory.createDirector("206006330", "Tumelo", "Mzaca");
        assertNotNull(director);
    }

}