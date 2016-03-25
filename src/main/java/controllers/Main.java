package controllers;

import data.entity.User;
import data.repositories.UserRepository;
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

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getMainPage(Map<String, Object> model){
        Iterable<User> users = userRepository.findAll();
        User user = users.iterator().next();
        model.put("name", user.getName());
        return "index";
    }
}
