//File Descriptor    : IdirectorRepository.java
//Program Descriptor : This is a Idirector Repository
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022

package za.ac.cput.LibrarySystem.repository.impl;

import za.ac.cput.LibrarySystem.domain.entity.Director;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

//push

public interface IdirectorRepository extends IRepository<Director, String> {

    //read, update, create and delete
    public Set<Director> getAll();
}
