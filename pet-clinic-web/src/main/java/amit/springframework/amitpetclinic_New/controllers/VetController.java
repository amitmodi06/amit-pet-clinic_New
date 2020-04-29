package amit.springframework.amitpetclinic_New.controllers;

import amit.springframework.amitpetclinic_New.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by KUAM on 4/19/2020
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"vets", "vets/index", "vets/index.html", "/vets.html"})
    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
