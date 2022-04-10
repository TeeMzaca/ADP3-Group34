package za.ac.cput.LibrarySystem.repository;
/*
    IRepository.java
    Author: Mogammad Faeedh Daniels ( 219174288 )
    Date: 10 April 2022
 */
public abstract class IRepository <O, PK>{
    O create(O t);
    O read(PK id);
    O update(O t);
    boolean delete (PK id);
}
