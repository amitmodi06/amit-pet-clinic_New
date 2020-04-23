package amit.springframework.amitpetclinic_New.bootstrap;

import amit.springframework.amitpetclinic_New.model.Owner;
import amit.springframework.amitpetclinic_New.model.Vet;
import amit.springframework.amitpetclinic_New.services.OwnerService;
import amit.springframework.amitpetclinic_New.services.VetService;
import amit.springframework.amitpetclinic_New.services.map.OwnerServiceMap;
import amit.springframework.amitpetclinic_New.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * created by KUAM on 4/23/2020
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Amit");
        owner1.setLastName("kumar");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Aparna");
        owner2.setLastName("Verma");

        ownerService.save(owner2);

        System.out.println("Loaded Owners.................!!");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ajay");
        vet1.setLastName("Singh");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Vijay");
        vet2.setLastName("Singh");

        vetService.save(vet2);

        System.out.println("Loaded Vets....................!!");
    }
}
