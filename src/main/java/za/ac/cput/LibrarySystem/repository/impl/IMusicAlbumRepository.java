package za.ac.cput.LibrarySystem.repository.impl;
/*
    IMusicAlbumRepository.java
    Interface for MusicAlbum Repository
    Author: Mogammad Faeedh Daniels ( 219174288 )
    Date: 10 April 2022
 */
import za.ac.cput.LibrarySystem.domain.entity.MusicAlbum;
import za.ac.cput.LibrarySystem.repository.IRepository;

import java.util.Set;

public interface IMusicAlbumRepository extends IRepository<MusicAlbum, String>{
    Set<MusicAlbum> getAll();

}
