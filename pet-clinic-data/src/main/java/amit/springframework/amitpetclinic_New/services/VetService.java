package amit.springframework.amitpetclinic_New.services;

import amit.springframework.amitpetclinic_New.model.Vet;

import java.util.Set;

/**
 * created by KUAM on 4/18/2020
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll()
}
