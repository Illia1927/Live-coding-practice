package mate.academy.spring.service;

import mate.academy.spring.dao.UserRepository;
import mate.academy.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<List<User>> getAll() {
        return Optional.of(userRepository.findAll());
    }

    @Override
    public Optional<User> getById(Long id) {
        return Optional.of(userRepository.getById(id));
    }
}
