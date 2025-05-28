package manager.gym.Gym.Manager.repository;

import jakarta.persistence.Table;
import manager.gym.Gym.Manager.entity.staff.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Table(name = "TRAINER")
public interface TrainerRepository extends JpaRepository<Trainer,Integer> {
    List<Trainer> findById(int id);

    @Query(value = "DELETE FROM TRAINER u WHERE u.id = id", nativeQuery = true)
    void deleteById(int id);
}
