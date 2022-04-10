package za.ac.cput.LibrarySystem.repository;

import za.ac.cput.LibrarySystem.domain.entity.Director;

public interface IdirectorRepository {
    void read();
    void update();
    void create();
    boolean delete();
    //read, update, create and delete
    public set<Director> getAll();
}
