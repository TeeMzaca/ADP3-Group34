package za.ac.cput.LibrarySystem.factory;
/*

        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.LibrarySystem.domain.entity.Periodical;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PeriodicalFactory2Test {
    @Test
    public void test() {
        Periodical periodical = PeriodicalFactory2.createPeriodical(2, "Mr", 12, "1788-05-13", "Scary", "A beewer story");
        assertNotNull(periodical);
        System.out.println(periodical);

    }
}