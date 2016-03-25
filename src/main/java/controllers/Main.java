package controllers;

import data.entity.User;
import data.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by dima on 09.02.16.
 */
@Controller
public class Main {

    static Logger log = LoggerFactory.getLogger(Main.class);

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getMainPage(Map<String, Object> model){
        User user = userRepository.getUser("Kyiv");
        model.put("name", user.getName());
        log.info("Name: " + user.getName());
        return "index";
    }
}
