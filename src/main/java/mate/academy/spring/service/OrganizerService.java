package mate.academy.spring.service;

import mate.academy.spring.model.Organizer;

import java.util.List;
import java.util.Optional;

public interface OrganizerService {
    Optional<Organizer> create(Organizer organizer);

    Optional<List<Organizer>> getAll();
}
