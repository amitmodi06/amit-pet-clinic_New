package amit.springframework.amitpetclinic_New.services;

import amit.springframework.amitpetclinic_New.model.Pet;

import java.util.Set;

/**
 * created by KUAM on 4/18/2020
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll()
}
