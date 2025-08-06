package io.software_architectures.clean.user_service.application_usecases;

import io.software_architectures.clean.user_service.application_usecases.ports.in.CreateUserUseCase;
import io.software_architectures.clean.user_service.application_usecases.ports.in.GetAllUsersUseCase;
import io.software_architectures.clean.user_service.application_usecases.ports.out.UserRepositoryPort;
import io.software_architectures.clean.user_service.domain.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements CreateUserUseCase, GetAllUsersUseCase {
    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        return userRepositoryPort.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositoryPort.findAll();
    }
}

