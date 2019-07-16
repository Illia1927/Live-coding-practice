package mate.academy.spring.dao;

import mate.academy.spring.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @EntityGraph("User.event")
    List<User> findAll();

    @EntityGraph("User.event")
    User getById(Long id);
}
