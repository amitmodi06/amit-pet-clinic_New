package amit.springframework.amitpetclinic_New.repositories;

import amit.springframework.amitpetclinic_New.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * created by KUAM on 5/1/2020
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
