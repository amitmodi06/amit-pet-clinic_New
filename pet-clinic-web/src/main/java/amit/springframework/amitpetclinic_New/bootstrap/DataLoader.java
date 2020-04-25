package amit.springframework.amitpetclinic_New.bootstrap;

import amit.springframework.amitpetclinic_New.model.Owner;
import amit.springframework.amitpetclinic_New.model.PetType;
import amit.springframework.amitpetclinic_New.model.Vet;
import amit.springframework.amitpetclinic_New.services.OwnerService;
import amit.springframework.amitpetclinic_New.services.PetTypeService;
import amit.springframework.amitpetclinic_New.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * created by KUAM on 4/23/2020
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Amit");
        owner1.setLastName("kumar");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Aparna");
        owner2.setLastName("Verma");

        ownerService.save(owner2);

        System.out.println("Loaded Owners.................!!");

        Vet vet1 = new Vet();
        vet1.setFirstName("Ajay");
        vet1.setLastName("Singh");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Vijay");
        vet2.setLastName("Singh");

        vetService.save(vet2);

        System.out.println("Loaded Vets....................!!");
    }
}
