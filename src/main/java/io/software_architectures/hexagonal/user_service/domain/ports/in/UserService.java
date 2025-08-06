package io.software_architectures.hexagonal.user_service.domain.ports.in;

import io.software_architectures.hexagonal.user_service.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);
}