package io.software_architectures.layered.user_service.repository_persistence;

import io.software_architectures.layered.user_service.model_database.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}