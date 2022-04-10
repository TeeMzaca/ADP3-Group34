package za.ac.cput.LibrarySystem.repository;
/*
        Periodical Repository
        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
import za.ac.cput.LibrarySystem.domain.entity.Periodical;
import za.ac.cput.LibrarySystem.repository.impl.IPeriodicalRepository;

import java.util.HashSet;
import java.util.Set;

public class PeriodicalRepository implements IPeriodicalRepository {
    public static PeriodicalRepository repository = null;
    private Set<Periodical> periodicalDB = null;

    private PeriodicalRepository(){
        periodicalDB = new HashSet<Periodical>();
    }

    public static PeriodicalRepository getRepository(){
        if (repository == null) {
            repository = new PeriodicalRepository();
        }
        return repository;
    }

    @Override
    public Periodical create(Periodical periodical) {
        boolean success = periodicalDB.add(periodical);
        if (!success)
            return null;
        return periodical;
    }

    @Override
    public Periodical read(String title) {
        Periodical periodical = periodicalDB.stream()
                .filter(e -> e.getTitle().equals(title))
                .findAny().orElse(null);
        return periodical;
    }

    @Override
    public Periodical update(Periodical periodical) {
        Periodical oldTitle= read(periodical.getTitle());
        if (oldTitle != null) {
            periodicalDB.remove(oldTitle);
            periodicalDB.add(periodical);
            return periodical;
        }
        return null;
    }

    @Override
    public boolean delete(String title) {
        Periodical periodicalDelete = read(title);
        if (periodicalDelete == null)
            return false;
        periodicalDB.remove(periodicalDelete);
        return true;
    }

    @Override
    public Set<Periodical> getAll() {
        return periodicalDB;
    }
}



