package mate.academy.spring.controller;

import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ModelAndView getById(ModelAndView mw, @PathVariable Long id){
        User user = userService.getById(id)
                .orElseGet(User::new);
        mw.addObject("user", user);
        mw.setViewName("user");
        return mw;
    }

    @RequestMapping(value = "/all-users", method = RequestMethod.GET)
    public ModelAndView getAll(ModelAndView mw) {
        List<User> users = userService.getAll()
                .orElseGet(Collections::emptyList);

        mw.addObject("users", users);
        mw.setViewName("all-users");
        return mw;
    }
}
