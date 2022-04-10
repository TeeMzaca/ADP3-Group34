//File Descriptor    : Director.java
//Program Descriptor : This is a director domain
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022

package za.ac.cput.LibrarySystem.repository;

import za.ac.cput.LibrarySystem.domain.entity.Film;
import za.ac.cput.LibrarySystem.repository.impl.IFilmRepository;

import java.util.Set;



public class FilmRepository implements IFilmRepository {

    @Override
    public Set<Film> getAll() {
        return null;
    }

    @Override
    public Film create(Film t) {
        return null;
    }

    @Override
    public Film read(String s) {
        return null;
    }

    @Override
    public Film update(Film t) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}
