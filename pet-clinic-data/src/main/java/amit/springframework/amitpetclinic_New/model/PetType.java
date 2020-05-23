package amit.springframework.amitpetclinic_New.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * created by KUAM on 4/16/2020
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Override
    public String toString() {

        return name;
    }
}
