//File Descriptor    : directoryRepository.java
//Program Descriptor : This is a director Repository
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022

package za.ac.cput.LibrarySystem.repository;

import za.ac.cput.LibrarySystem.domain.entity.Director;

import java.util.Set;

public class directorRepository implements IdirectorRepository{
    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void create() {

    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public Set<Director> getAll() {
        return null;
    }
}
