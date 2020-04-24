package amit.springframework.amitpetclinic_New.services.map;

import amit.springframework.amitpetclinic_New.model.BaseEntity;

import java.util.*;

/**
 * created by KUAM on 4/19/2020
 */
public abstract class AbstractMapService<T extends BaseEntity, Id extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(Id id){
        return map.get(id);
    }

    T save(T object){
        if (object !=null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Object can't be null..!!");
        }
        return object;
    }

    void deleteById(Id id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextId=null;
        try{
            nextId = Collections.max(map.keySet())+1;
        }catch(NoSuchElementException e){
            nextId=1L;
        }
        return nextId;
    }
}
