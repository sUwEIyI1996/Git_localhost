package tk.etl.Controller;

import tk.etl.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/helloUser/{name}")
    public String selectPerson(@PathVariable String name){
        return personService.selectMapper(name).toString();
    }
}
