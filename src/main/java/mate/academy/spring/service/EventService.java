package mate.academy.spring.service;

import mate.academy.spring.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {

    Optional<List<Event>> getAll();

    Optional<Event> create(Event event);
}
