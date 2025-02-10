package localyost.wlp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Competition extends BaseEntity {

    private String title;
    private Date started;

    @OneToMany
    private List<Participant> participants;


}
