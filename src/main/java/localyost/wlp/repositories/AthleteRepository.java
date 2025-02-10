package localyost.wlp.repositories;

import localyost.wlp.entities.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AthleteRepository extends JpaRepository<Athlete, Long> {}
