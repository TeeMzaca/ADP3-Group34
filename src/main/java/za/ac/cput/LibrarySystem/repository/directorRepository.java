//File Descriptor    : directoryRepository.java
//Program Descriptor : This is a director Repository
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022

package za.ac.cput.LibrarySystem.repository;

import za.ac.cput.LibrarySystem.domain.entity.Director;
import za.ac.cput.LibrarySystem.repository.impl.IdirectorRepository;

import java.util.Set;

//push

public class directorRepository implements IdirectorRepository {

    @Override
    public Set<Director> getAll() {
        return null;
    }

    @Override
    public Director create(Director t) {
        return null;
    }

    @Override
    public Director read(String s) {
        return null;
    }

    @Override
    public Director update(Director t) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}
