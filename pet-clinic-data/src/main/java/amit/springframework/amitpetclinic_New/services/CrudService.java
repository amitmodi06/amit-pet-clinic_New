package amit.springframework.amitpetclinic_New.services;

import java.util.Set;

/**
 * created by KUAM on 4/19/2020
 */
public interface CrudService<T, Id> {

    Set<T> findAll();

    T findById(Id id);

    T save(T object);

    void delete(T object);

    void deleteById(Id id);
}
