package mate.academy.spring.controller;

import mate.academy.spring.model.Organizer;
import mate.academy.spring.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class OrganizerController {

    @Autowired
    private OrganizerService organizerService;

    @RequestMapping(value = "/add-organizer", method = RequestMethod.GET)
    public ModelAndView create(ModelAndView mw) {
        mw.addObject("organizer", new Organizer());
        mw.setViewName("add-organizer");
        return mw;
    }

    @RequestMapping(value = "/add-organizer", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute Organizer organizer) {
        organizerService.create(organizer);
        return getAllOrganizer();
    }

    private ModelAndView getAllOrganizer() {
        List<Organizer> organizerList = organizerService.getAll()
                .orElseGet(Collections::emptyList);
        ModelAndView mw = new ModelAndView();
        mw.addObject("organizer", organizerList);
        mw.setViewName("organizer");
        return mw;
    }
}
