package localyost.wlp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Participant extends BaseEntity {

    @OneToOne
    private Athlete athlete;

    private float bodyWeight;

    @OneToMany
    List<Attempt> attempts;

}
