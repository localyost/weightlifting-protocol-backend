package localyost.wlp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import localyost.wlp.enums.CompetitionType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Competition extends BaseEntity {

    private String title;
    private Date started;
    private CompetitionType type;

    @OneToMany
    private List<Participant> participants;

    @OneToMany
    List<Club> clubs;

    private transient Map<Club, List<Participant>> clubToParticipants;

}
