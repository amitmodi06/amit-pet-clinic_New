package amit.springframework.amitpetclinic_New.services.map;

import amit.springframework.amitpetclinic_New.model.Owner;
import amit.springframework.amitpetclinic_New.services.CrudService;

import java.util.Set;

/**
 * created by KUAM on 4/19/2020
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
