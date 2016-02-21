package nl.wjl.template.springbootjpa.web;

import nl.wjl.template.springbootjpa.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wouter on 21-2-2016.
 */
@RestController
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
