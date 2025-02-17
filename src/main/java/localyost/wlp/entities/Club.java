package localyost.wlp.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Club extends BaseEntity {

    private String name;
    private String description;

    @OneToMany
    private List<Athlete> members;
}
