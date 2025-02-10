package localyost.wlp.repositories;

import jakarta.transaction.Transactional;
import localyost.wlp.entities.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompetitionRepository extends JpaRepository<Competition, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Competition c SET c.started = CURRENT_TIMESTAMP WHERE c.id = :id")
    void start(@Param("id") Long id);
}
