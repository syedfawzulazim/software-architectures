package io.software_architectures.layered.user_service.controller_presentation;

import io.software_architectures.layered.user_service.model_database.User;
import io.software_architectures.layered.user_service.service_business.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
