//File Descriptor    : IFilmRepository.java
//Program Descriptor : This is a IFilm Repository
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022
package za.ac.cput.LibrarySystem.repository.impl;

import za.ac.cput.LibrarySystem.domain.entity.Film;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

public interface IFilmRepository extends IRepository<Film, String> {
    //read, update, create and delete
    public Set<Film> getAll();
}
