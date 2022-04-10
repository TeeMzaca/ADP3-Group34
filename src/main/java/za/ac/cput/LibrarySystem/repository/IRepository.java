package za.ac.cput.LibrarySystem.repository;

public interface IRepository <J, ID>{
    J create(J t);
    J read(ID id);
    J update(J t);
    boolean delete(ID id);
}

