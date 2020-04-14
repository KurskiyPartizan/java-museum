package sekerin.museum.javamuseum.services;

import org.springframework.stereotype.Service;
import sekerin.museum.javamuseum.models.People;

public interface PeopleService {
    Iterable<People> listAllPeoples();

    People getPeopleById(Integer id);

    People savePeople (People people);

    void deletePeople(Integer id);
}

