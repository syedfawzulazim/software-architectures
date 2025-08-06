package io.software_architectures.clean.user_service.application_usecases.ports.out;

import io.software_architectures.clean.user_service.domain.model.User;

import java.util.List;

public interface UserRepositoryPort {
    User save(User user);
    List<User> findAll();
}
