package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
