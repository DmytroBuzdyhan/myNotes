package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by dima on 09.02.16.
 */
@Controller
public class Main {

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getMainPage(Map<String, Object> model){
        model.put("name", "Dima");
        return "index";
    }
}
