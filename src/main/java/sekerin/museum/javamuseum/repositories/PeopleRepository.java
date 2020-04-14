package sekerin.museum.javamuseum.repositories;


import org.springframework.data.repository.CrudRepository;
import sekerin.museum.javamuseum.models.People;

public interface PeopleRepository extends CrudRepository<People, Integer>{
}

