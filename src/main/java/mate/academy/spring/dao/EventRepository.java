package mate.academy.spring.dao;

import mate.academy.spring.model.Event;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {

    @EntityGraph("Event.usersStatus")
    List<Event> findAll();

    @EntityGraph("Event.usersStatus")
    Optional<Event> getById(Long id);
}
