package amit.springframework.amitpetclinic_New.services;

import amit.springframework.amitpetclinic_New.model.Owner;

/**
 * created by KUAM on 4/18/2020
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
