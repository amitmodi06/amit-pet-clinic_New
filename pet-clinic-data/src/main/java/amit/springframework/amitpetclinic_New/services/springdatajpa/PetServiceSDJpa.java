package amit.springframework.amitpetclinic_New.services.springdatajpa;

import amit.springframework.amitpetclinic_New.model.Pet;
import amit.springframework.amitpetclinic_New.repositories.PetRepository;
import amit.springframework.amitpetclinic_New.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * created by KUAM on 5/1/2020
 */
@Service
@Profile("springdatajpa")
public class PetServiceSDJpa implements PetService {

    private final PetRepository petRepository;

    public PetServiceSDJpa(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
