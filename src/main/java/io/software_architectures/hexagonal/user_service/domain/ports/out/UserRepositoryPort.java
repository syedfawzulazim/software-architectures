package io.software_architectures.hexagonal.user_service.domain.ports.out;


import io.software_architectures.hexagonal.user_service.domain.User;

import java.util.List;

public interface UserRepositoryPort {
    List<User> findAll();
    User save(User user);
}