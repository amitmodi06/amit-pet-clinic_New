package amit.springframework.amitpetclinic_New.services.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * created by KUAM on 4/19/2020
 */
public abstract class AbstractMapService<T, Id> {

    protected Map<Id, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashMap<>(map.values());
    }

    T findById(Id id){
        return map.get(id);
    }

    T save(Id id, T object){
        map.put(id, object);
        return object;
    }

    void deleteById(Id id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
