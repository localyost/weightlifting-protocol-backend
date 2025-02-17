package localyost.wlp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Athlete extends BaseEntity {

    private String firstName;
    private String lastName;

    @OneToOne
    private Club club;

    private boolean active = true;

    private int birthYear;
    
}


