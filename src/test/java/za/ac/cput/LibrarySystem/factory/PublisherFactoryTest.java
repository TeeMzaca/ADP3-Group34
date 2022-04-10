package za.ac.cput.LibrarySystem.factory;
/*

        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.LibrarySystem.domain.entity.Publisher;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PublisherFactoryTest {
    @Test
    public void test(){
        Publisher publisher = PublisherFactory.createPublisher(1,"Corway","one in a million","1988-27-95");
        assertNotNull(publisher);
        System.out.println(publisher);
    }
    }

