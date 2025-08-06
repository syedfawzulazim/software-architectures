package io.software_architectures.clean.user_service.application_usecases.ports.in;

import io.software_architectures.clean.user_service.domain.model.User;

import java.util.List;

public interface GetAllUsersUseCase {
    List<User> getAllUsers();
}

