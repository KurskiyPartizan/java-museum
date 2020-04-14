package sekerin.museum.javamuseum.repositories;

import org.springframework.data.repository.CrudRepository;
import sekerin.museum.javamuseum.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
