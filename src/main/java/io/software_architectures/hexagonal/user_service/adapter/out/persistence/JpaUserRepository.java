package io.software_architectures.hexagonal.user_service.adapter.out.persistence;


import io.software_architectures.clean.user_service.adapter.out.persistence.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<UserJpaEntity, Long> {}
