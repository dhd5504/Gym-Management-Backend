package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}
