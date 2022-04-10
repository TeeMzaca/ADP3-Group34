package za.ac.cput.LibrarySystem.repository;
/*
        MusicAlbum.java
        MusicAlbum Repository
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 9 April 2022
 */
import za.ac.cput.LibrarySystem.domain.entity.MusicAlbum;
/*import za.ac.cput.LibrarySystem.repository.impl.IMusicAlbumRepository;*/

import java.util.HashSet;
import java.util.Set;

public class MusicAlbumRepository implements IMusicAlbumRepository {
    public static MusicAlbumRepository repository = null;
    private Set<MusicAlbum> albumDB = null;

    private MusicAlbumRepository() { albumDB = new HashSet<MusicAlbum>();}

    public static MusicAlbumRepository getRepository(){
        if (repository == null){
            repository = new MusicAlbumRepository();
        }
        return repository;
    }

    @Override
    public MusicAlbum create(MusicAlbum album){
        boolean success = albumDB.add(album);
        if (!success)
            return null;
        return album;
    }

    @Override
    public MusicAlbum read(Integer id){
        MusicAlbum album = albumDB.stream()
                .filter(e -> e.getId().equals(id))
                .findAny().orElse(null);
        return album;
    }

    @Override
    public MusicAlbum update(MusicAlbum album) {
        MusicAlbum oldId = read(album.getId());
        if (oldId != null) {
            albumDB.remove(oldId);
            albumDB.add(album);
            return album;
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        MusicAlbum albumDelete = read(id);
        if(albumDelete == null){
            return false;
        }
        albumDB.remove(albumDelete);
        return true;
    }

    @Override
    public Set<MusicAlbum> getAll(){
        return albumDB;}
}
