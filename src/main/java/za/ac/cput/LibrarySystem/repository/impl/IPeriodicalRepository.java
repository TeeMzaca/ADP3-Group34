package za.ac.cput.LibrarySystem.repository.impl;
/*
        InterfacePeriodicalRepository
        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import za.ac.cput.LibrarySystem.domain.entity.Periodical;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

public interface IPeriodicalRepository extends IRepository<Periodical, String> {
    Set<Periodical> getAll();

}

