package za.ac.cput.LibrarySystem.repository;
/*

        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.LibrarySystem.domain.entity.Publisher;
import za.ac.cput.LibrarySystem.factory.PublisherFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PublisherRepositoryTest {
    private static PublisherRepository repository = PublisherRepository.getRepository();
    private static Publisher publisher = PublisherFactory.createPublisher(1,"Corway","one in a million","1988-27-95");

    @Test
    void a_create() {
        Publisher created = repository.create(publisher);
        assertEquals(publisher.getId(), created.getId());
        System.out.println("Created:" + created);
    }

    @Test
    void b_read() {
        Publisher reading = repository.read(publisher.getCompanyName());
        assertNull(reading);
        System.out.println("Read: " + reading);
    }

    @Test
    void c_update() {
        Publisher updated = new Publisher.Builder().copy(publisher).setBio("a little man in the woods")
                .build();
        assertNull(repository.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    void e_delete() {
        boolean remove = repository.delete(publisher.getStartDate());
        assertFalse(remove);
        System.out.println("Deleted: " + remove);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}