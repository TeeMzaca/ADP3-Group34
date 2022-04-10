package za.ac.cput.LibrarySystem.repository.impl;
/*
        InterfacePublisherRepository
        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import za.ac.cput.LibrarySystem.domain.entity.Publisher;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

public interface IPublisherRepository extends IRepository<Publisher, String> {
    Set<Publisher> getAll();

}

