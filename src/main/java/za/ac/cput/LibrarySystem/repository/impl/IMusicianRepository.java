package za.ac.cput.LibrarySystem.repository.impl;
/*
    IMusicianRepository.java
    Interface for Musician Repository
    Author: Mogammad Faeedh Daniels ( 219174288 )
    Date: 10 April 2022
 */
import za.ac.cput.LibrarySystem.domain.entity.Musician;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

public class IMusicianRepository extends IRepository<Musician, String> {
    Set<Musician> getAll();{
}
