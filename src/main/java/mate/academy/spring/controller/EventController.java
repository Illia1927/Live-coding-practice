package mate.academy.spring.controller;

import mate.academy.spring.model.Event;
import mate.academy.spring.model.Organizer;
import mate.academy.spring.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/all-events", method = RequestMethod.GET)
    public ModelAndView getAll() {
        return getAllEvent();
    }

    @RequestMapping(value = "/add-event", method = RequestMethod.GET)
    public ModelAndView create(ModelAndView mw) {
        mw.addObject("addEvents", new Event());
        mw.setViewName("add-event");
        return mw;
    }

    @RequestMapping(value = "/add-event", method = RequestMethod.POST)
    public ModelAndView create(@ModelAttribute Event event) {
        eventService.create(event);
        return getAllEvent();
    }

    private ModelAndView getAllEvent() {
        List<Event> eventList = eventService.getAll()
                .orElseGet(Collections::emptyList);
        ModelAndView mw = new ModelAndView();
        mw.addObject("events", eventList);
        mw.setViewName("events");
        return mw;
    }
}
