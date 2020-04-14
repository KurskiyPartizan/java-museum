package sekerin.museum.javamuseum.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"sekerin.museum.javamuseum.models"})
@EnableJpaRepositories(basePackages = {"sekerin.museum.javamuseum.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
