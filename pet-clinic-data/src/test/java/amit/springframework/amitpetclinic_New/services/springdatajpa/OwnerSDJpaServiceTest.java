package amit.springframework.amitpetclinic_New.services.springdatajpa;

import amit.springframework.amitpetclinic_New.model.Owner;
import amit.springframework.amitpetclinic_New.repositories.OwnerRepository;
import amit.springframework.amitpetclinic_New.repositories.PetRepository;
import amit.springframework.amitpetclinic_New.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Singh";
    public static final long ID = 1L;
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService service;

    Owner returnOwner;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(ID).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner singh = service.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME, singh.getLastName());

        verify(ownerRepository, times(1)).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerSet.add(Owner.builder().id(ID).build());
        ownerSet.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(ownerSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(java.util.Optional.of(returnOwner));

        Owner owner = service.findById(ID);
        assertEquals(ID, owner.getId());
        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = service.findById(ID);
        assertNull(owner);
    }

    @Test
    void save() {
        when(ownerRepository.save(any(Owner.class))).thenReturn(returnOwner);

        Owner ownerToSave = Owner.builder().id(ID).build();
        Owner owner = service.save(ownerToSave);
        assertNotNull(owner);
        verify(ownerRepository).save(any(Owner.class));
    }

    @Test
    void delete() {
        service.delete(returnOwner);

        //default is 1 times
        verify(ownerRepository,times(1) ).delete(any(Owner.class));
    }

    @Test
    void deleteById() {
        service.deleteById(ID);
        verify(ownerRepository, times(1)).deleteById(anyLong());
    }
}