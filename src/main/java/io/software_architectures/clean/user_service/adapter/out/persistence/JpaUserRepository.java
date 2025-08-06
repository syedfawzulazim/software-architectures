package io.software_architectures.clean.user_service.adapter.out.persistence;


import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<UserJpaEntity, Long> {}
