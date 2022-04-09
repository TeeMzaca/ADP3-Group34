package za.ac.cput.LibrarySystem.repository;
// J -> Object
// ID -> Primary key

public interface IRepository <J, ID>{
    J create(J t);
    J read(ID id);
    J update(J t);
    boolean delete(ID id);
}
