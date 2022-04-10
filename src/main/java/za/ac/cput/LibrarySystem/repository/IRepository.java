package za.ac.cput.LibrarySystem.repository;
/*
        InterfaceRepository
        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
// T -> Object
// ID -> Primary key
public interface IRepository <J, ID>{
    J create(J t);
    J read(ID id);
    J update(J t);
    boolean delete(ID id);
}

