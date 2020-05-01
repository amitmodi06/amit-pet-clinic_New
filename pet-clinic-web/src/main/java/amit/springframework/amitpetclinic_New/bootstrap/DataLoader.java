package amit.springframework.amitpetclinic_New.bootstrap;

import amit.springframework.amitpetclinic_New.model.*;
import amit.springframework.amitpetclinic_New.services.OwnerService;
import amit.springframework.amitpetclinic_New.services.PetTypeService;
import amit.springframework.amitpetclinic_New.services.SpecialityService;
import amit.springframework.amitpetclinic_New.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * created by KUAM on 4/23/2020
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService,
                      PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if(count ==0){
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSergery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Amit");
        owner1.setLastName("kumar");
        owner1.setAddress("123 Defence Enclave");
        owner1.setCity("Meerut");
        owner1.setTelephone("1234567890");

        Pet amitsPet = new Pet();
        amitsPet.setPetType(savedDogPetType);
        amitsPet.setPetOwner(owner1);
        amitsPet.setBirthDate(LocalDate.now());
        amitsPet.setName("Tiger");
        owner1.getPets().add(amitsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Aparna");
        owner2.setLastName("Verma");
        owner1.setAddress("123 Defence Enclave");
        owner1.setCity("Meerut");
        owner1.setTelephone("1234567890");

        Pet aparnasPet = new Pet();
        aparnasPet.setPetType(savedCatPetType);
        aparnasPet.setPetOwner(owner2);
        aparnasPet.setBirthDate(LocalDate.now());
        aparnasPet.setName("ChiChi");
        owner2.getPets().add(aparnasPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners.................!!");

        Vet vet1 = new Vet();
        vet1.setFirstName("Ajay");
        vet1.setLastName("Singh");

        vet1.getSpecialities().add(radiology);
        vet1.getSpecialities().add(surgery);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Vijay");
        vet2.setLastName("Singh");

        vet2.getSpecialities().add(surgery);
        vet2.getSpecialities().add(dentistry);

        vetService.save(vet2);

        System.out.println("Loaded Vets....................!!");
    }
}
