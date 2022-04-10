package za.ac.cput.LibrarySystem.repository;

public interface IRepository<S, T> {
    void read();
    void update();
    void create();
    boolean delete();
}
