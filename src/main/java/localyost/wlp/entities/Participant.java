package localyost.wlp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Participant extends BaseEntity {

    @OneToOne
    private Athlete athlete;

    private float bodyWeight;
}
