package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.TrainingHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingHistoryRepository extends JpaRepository<TrainingHistory, Integer> {
}
