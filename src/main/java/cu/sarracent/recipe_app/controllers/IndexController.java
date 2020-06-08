package cu.sarracent.recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("Algun mensaje que mandar... 1234555ffff fffddddd dsdasdsadsa");
        return "index";
    }
}
