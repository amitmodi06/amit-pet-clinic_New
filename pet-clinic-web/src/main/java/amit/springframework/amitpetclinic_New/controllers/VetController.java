package amit.springframework.amitpetclinic_New.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by KUAM on 4/19/2020
 */
@Controller
public class VetController {

    @RequestMapping({"vets", "vets/index", "vets/index.html"})
    public String listVets(){

        return "vets/index";
    }
}
