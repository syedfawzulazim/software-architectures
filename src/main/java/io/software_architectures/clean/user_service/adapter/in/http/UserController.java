package io.software_architectures.clean.user_service.adapter.in.http;
import io.software_architectures.clean.user_service.application_usecases.ports.in.CreateUserUseCase;
import io.software_architectures.clean.user_service.application_usecases.ports.in.GetAllUsersUseCase;
import io.software_architectures.clean.user_service.domain.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUserUseCase createUserUseCase;
    private final GetAllUsersUseCase getAllUsersUseCase;

    public UserController(CreateUserUseCase createUserUseCase, GetAllUsersUseCase getAllUsersUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.getAllUsersUseCase = getAllUsersUseCase;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return createUserUseCase.createUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return getAllUsersUseCase.getAllUsers();
    }
}

