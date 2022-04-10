package za.ac.cput.LibrarySystem.repository;
/*
        Publisher Repository
        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import za.ac.cput.LibrarySystem.domain.entity.Publisher;
import za.ac.cput.LibrarySystem.repository.impl.IPublisherRepository;

import java.util.HashSet;
import java.util.Set;

public class PublisherRepository implements IPublisherRepository {
    public static PublisherRepository repository = null;
    private Set<Publisher> publisherDB = null;

    private PublisherRepository(){
        publisherDB = new HashSet<Publisher>();
    }

    public static PublisherRepository getRepository(){
        if (repository == null) {
            repository = new PublisherRepository();
        }
        return repository;
    }

    @Override
    public Publisher create(Publisher publisher) {
        boolean success = publisherDB.add(publisher);
        if (!success)
            return null;
        return publisher;
    }

    @Override
    public Publisher read(String bio) {
        Publisher publisher = publisherDB.stream()
                .filter(e -> e.getBio().equals(bio))
                .findAny().orElse(null);
        return publisher;
    }

    @Override
    public Publisher update(Publisher publisher) {
        Publisher oldBio= read(publisher.getBio());
        if (oldBio!= null) {
            publisherDB.remove(oldBio);
            publisherDB.add(publisher);
            return publisher;
        }
        return null;
    }

    @Override
    public boolean delete(String bio) {
        Publisher publisherDelete = read(bio);
        if (publisherDelete == null)
            return false;
        publisherDB.remove(publisherDelete);
        return true;
    }

    @Override
    public Set<Publisher> getAll() {
        return publisherDB;
    }
}

