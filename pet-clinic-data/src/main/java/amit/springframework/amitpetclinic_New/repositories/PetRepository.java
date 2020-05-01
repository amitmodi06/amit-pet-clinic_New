package amit.springframework.amitpetclinic_New.repositories;

import amit.springframework.amitpetclinic_New.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * created by KUAM on 5/1/2020
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
