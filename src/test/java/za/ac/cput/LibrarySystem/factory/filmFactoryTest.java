package za.ac.cput.LibrarySystem.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.LibrarySystem.domain.entity.Film;

import static org.junit.jupiter.api.Assertions.*;

class filmFactoryTest {

    @Test
    public void test() {
        Film film = filmFactory.createFilm("1", "How To Pass ADP3", "10 May 2022");
        assertNotNull(film);
    }

}