package amit.springframework.amitpetclinic_New.model;

import java.io.Serializable;

/**
 * created by KUAM on 4/18/2020
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
