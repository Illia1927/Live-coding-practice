package mate.academy.spring.service;

import mate.academy.spring.dao.OrganizerRepository;
import mate.academy.spring.model.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizerServiceImpl implements OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;

    @Override
    public Optional<Organizer> create(Organizer organizer) {
        return Optional.of(organizerRepository.save(organizer));
    }

    @Override
    public Optional<List<Organizer>> getAll() {
        return Optional.of(organizerRepository.findAll());
    }
}
