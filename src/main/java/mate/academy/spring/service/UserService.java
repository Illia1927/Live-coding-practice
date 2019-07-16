package mate.academy.spring.service;

import mate.academy.spring.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<List<User>> getAll();

    Optional<User> getById(Long id);
}
