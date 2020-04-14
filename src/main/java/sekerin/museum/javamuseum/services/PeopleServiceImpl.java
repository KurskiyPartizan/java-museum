package sekerin.museum.javamuseum.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sekerin.museum.javamuseum.models.People;
import sekerin.museum.javamuseum.repositories.PeopleRepository;

import java.util.Optional;

@Service
public class PeopleServiceImpl implements PeopleService {

    private PeopleRepository peopleRepository;

    @Autowired
    public void setPeopleRepository(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public Iterable<People> listAllPeoples() {
        return peopleRepository.findAll();
    }

    @Override
    public People getPeopleById(Integer id) {
        Optional<People> p =  peopleRepository.findById(id);
        return p.get();
    }

    @Override
    public People savePeople(People people) {
        return peopleRepository.save(people);
    }

    @Override
    public void deletePeople(Integer id) {
        peopleRepository.deleteById(id);
    }
}
