package za.ac.cput.LibrarySystem.repository;
/*

        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.LibrarySystem.domain.entity.Periodical;
import za.ac.cput.LibrarySystem.factory.PeriodicalFactory2;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PeriodicalRepositoryTest {
    private static PeriodicalRepository repository = PeriodicalRepository.getRepository();
    private static Periodical periodical = PeriodicalFactory2.createPeriodical(2, "Mr", 12, "1788-05-13", "Scary", "A beewer story");

    @Test
    void a_create() {
        Periodical created = repository.create(periodical);
        assertEquals(periodical.getId(), created.getId());
        System.out.println("Created:" + created);
    }

    @Test
    void b_read() {
        Periodical read = repository.read(periodical.getTitle());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Periodical updated = new Periodical.Builder().copy(periodical).setReleaseDate("2007-02-02")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    void e_delete() {
        boolean successfully = repository.delete(periodical.getTitle());
        assertTrue(successfully);
        System.out.println("Deleted: " + successfully);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}