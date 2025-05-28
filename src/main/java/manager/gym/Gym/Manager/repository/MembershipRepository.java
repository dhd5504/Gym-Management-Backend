package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Integer> {
}
