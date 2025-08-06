package io.software_architectures.hexagonal.user_service.application.service;

import io.software_architectures.hexagonal.user_service.domain.User;
import io.software_architectures.hexagonal.user_service.domain.ports.in.UserService;
import io.software_architectures.hexagonal.user_service.domain.ports.out.UserRepositoryPort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepositoryPort userRepository;

    public UserServiceImpl(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}

