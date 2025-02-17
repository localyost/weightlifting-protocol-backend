package localyost.wlp.repositories;

import localyost.wlp.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
