package za.ac.cput.LibrarySystem.repository;
/*
        MusicianRepository.java
        Musician Repository
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 9 April 2022
 */
import za.ac.cput.LibrarySystem.domain.entity.Musician;
/*import za.ac.cput.LibrarySystem.repository.impl.IMusicianRepository;*/

import java.util.HashSet;
import java.util.Set;

public class MusicianRepository implements IMusicianRepository {
    public static MusicianRepository repository = null;
    private Set<Musician> musicianDB = null;

    private MusicianRepository(){ musicianDB = new HashSet<Musician>();}


    public static MusicianRepository getRepository(){
            if (repository == null) {
                repository = new MusicianRepository();
            }
            return repository;
        }

        @Override
        public Musician create(Musician musician) {
            boolean success = musicianDB.add(musician);
            if (!success)
                return null;
            return musician;
        }

        @Override
        public Musician read(String bio) {
            Musician musician = musicianDB.stream()
                    .filter(e -> e.getBio().equals(bio))
                    .findAny().orElse(null);
            return musician;
        }

        @Override
        public Musician update(Musician musician) {
            Musician oldBio = read(muscian.getBio());
            if (oldBio != null) {
                musicianDB.remove(oldBio);
                musicianDB.add(musician);
                return musician;
            }
            return null;
        }

        @Override
        public boolean delete(String bio) {
            musician musicianDelete = read(bio);
            if (musicianDelete == null)
                return false;
            musicianDB.remove(musicianDelete);
            return true;
        }

        @Override
        public Set<Musician> getAll() {
            return musicianDB;
        }
}
