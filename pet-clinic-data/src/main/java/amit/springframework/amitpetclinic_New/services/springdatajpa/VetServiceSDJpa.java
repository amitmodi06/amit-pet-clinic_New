package amit.springframework.amitpetclinic_New.services.springdatajpa;

import amit.springframework.amitpetclinic_New.model.Vet;
import amit.springframework.amitpetclinic_New.repositories.VetRepository;
import amit.springframework.amitpetclinic_New.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * created by KUAM on 5/1/2020
 */
@Service
@Profile("springdatajpa")
public class VetServiceSDJpa implements VetService {

    private final VetRepository vetRepository;

    public VetServiceSDJpa(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
