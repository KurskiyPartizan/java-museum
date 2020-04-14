package sekerin.museum.javamuseum.controllers;

import sekerin.museum.javamuseum.models.People;
import sekerin.museum.javamuseum.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PeopleController {

    private PeopleService peopleService;

    @Autowired
    public void setProductService(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @RequestMapping("people/new")
    public String newProduct(Model model){
        model.addAttribute("people", new People());
        return "fill";
    }

    @RequestMapping(value = "people", method = RequestMethod.POST)
    public String saveProduct(People people){
        peopleService.savePeople(people);
        return "redirect:/people/" + people.getId();
    }

    @RequestMapping("people/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        model.addAttribute("people", peopleService.getPeopleById(id));
        return "show";
    }

    @RequestMapping(value = "/peoples", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("peoples", peopleService.listAllPeoples());
        return "peoples";
    }

    @RequestMapping("people/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("people", peopleService.getPeopleById(id));
        return "fill";
    }

    @RequestMapping("people/delete/{id}")
    public String delete(@PathVariable Integer id){
        peopleService.deletePeople(id);
        return "redirect:/peoples";
    }

}
