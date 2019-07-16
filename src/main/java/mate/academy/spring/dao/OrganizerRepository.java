package mate.academy.spring.dao;

import mate.academy.spring.model.Organizer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
    @EntityGraph("Organizer.createdEvents")
    List<Organizer> findAll();
}
