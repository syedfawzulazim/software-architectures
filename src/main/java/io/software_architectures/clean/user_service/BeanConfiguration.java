package io.software_architectures.clean.user_service;
import io.software_architectures.clean.user_service.application_usecases.UserService;
import io.software_architectures.clean.user_service.application_usecases.ports.in.CreateUserUseCase;
import io.software_architectures.clean.user_service.application_usecases.ports.in.GetAllUsersUseCase;
import io.software_architectures.clean.user_service.application_usecases.ports.out.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CreateUserUseCase createUserUseCase(UserRepositoryPort port) {
        return new UserService(port);
    }

    @Bean
    public GetAllUsersUseCase getAllUsersUseCase(UserRepositoryPort port) {
        return new UserService(port);
    }
}
