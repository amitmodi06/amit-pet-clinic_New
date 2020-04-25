package amit.springframework.amitpetclinic_New.model;

import java.util.Set;

/**
 * created by KUAM on 4/16/2020
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
