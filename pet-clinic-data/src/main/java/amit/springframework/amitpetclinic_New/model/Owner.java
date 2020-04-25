package amit.springframework.amitpetclinic_New.model;

import java.util.Set;

/**
 * created by KUAM on 4/16/2020
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
