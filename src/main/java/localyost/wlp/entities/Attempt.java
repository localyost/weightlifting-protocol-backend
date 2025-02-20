package localyost.wlp.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Attempt extends BaseEntity {

    private float weight;

    private boolean success;

}
