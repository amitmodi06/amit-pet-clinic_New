package amit.springframework.amitpetclinic_New.services;

import amit.springframework.amitpetclinic_New.model.Owner;

import java.util.Set;

/**
 * created by KUAM on 4/18/2020
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll()
}
