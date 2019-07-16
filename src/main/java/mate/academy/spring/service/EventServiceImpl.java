package mate.academy.spring.service;

import mate.academy.spring.dao.EventRepository;
import mate.academy.spring.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Optional<List<Event>> getAll() {
        return Optional.of(eventRepository.findAll());
    }

    @Override
    public Optional<Event> create(Event event) {
        return Optional.of(eventRepository.save(event));
    }
}
