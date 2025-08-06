package io.software_architectures.clean.user_service.adapter.out.persistence;

import io.software_architectures.clean.user_service.application_usecases.ports.out.UserRepositoryPort;
import io.software_architectures.clean.user_service.domain.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserPersistenceAdapter implements UserRepositoryPort {

    private final JpaUserRepository jpaUserRepository;

    public UserPersistenceAdapter(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public User save(User user) {
        UserJpaEntity entity = new UserJpaEntity(user.getId(), user.getName(), user.getEmail());
        UserJpaEntity saved = jpaUserRepository.save(entity);
        return new User(saved.getId(), saved.getName(), saved.getEmail());
    }

    @Override
    public List<User> findAll() {
        return jpaUserRepository.findAll()
                .stream()
                .map(e -> new User(e.getId(), e.getName(), e.getEmail()))
                .collect(Collectors.toList());
    }
}

