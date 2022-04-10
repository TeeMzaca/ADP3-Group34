//File Descriptor    : IRepository.java
//Program Descriptor : This is a IRepository
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022

package za.ac.cput.LibrarySystem.repository;

//push

public interface IRepository<S, T> {
    void read();
    void update();
    void create();
    boolean delete();
}
