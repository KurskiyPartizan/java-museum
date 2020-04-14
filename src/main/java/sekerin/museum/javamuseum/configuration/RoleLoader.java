package sekerin.museum.javamuseum.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sekerin.museum.javamuseum.models.Role;
import sekerin.museum.javamuseum.repositories.RoleRepository;

@Component
public class RoleLoader implements ApplicationListener<ContextRefreshedEvent> {
    private RoleRepository roleRepository;
    @Autowired
    public void setProductRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Role r = new Role();
        r.setId(1L);
        r.setName("ROLE_USER");
        roleRepository.save(r);

        r = new Role();
        r.setId(2L);
        r.setName("ROLE_ADMIN");
        roleRepository.save(r);
    }
}
