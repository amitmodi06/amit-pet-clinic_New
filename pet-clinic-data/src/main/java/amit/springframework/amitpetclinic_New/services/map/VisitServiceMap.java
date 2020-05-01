package amit.springframework.amitpetclinic_New.services.map;

import amit.springframework.amitpetclinic_New.model.Visit;
import amit.springframework.amitpetclinic_New.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by KUAM on 5/1/2020
 */
@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
        if(object.getPet()==null || object.getPet().getPetOwner()==null || object.getPet().getId()==null ||
                object.getPet().getPetOwner().getId()==null){
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(object);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
