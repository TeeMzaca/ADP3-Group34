package za.ac.cput.LibrarySystem.repository;
/*
        InterfacePeriodicalRepository
        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import za.ac.cput.LibrarySystem.domain.entity.Periodical;

import java.util.Set;

public interface IPeriodicalRepository extends IRepository<Periodical, String>{
    Set<Periodical> getAll();

}

