package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.ClassManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassManagerRepository extends JpaRepository<ClassManager,Integer> {
    @Query(value = "SELECT u FROM ClassManager u WHERE u.yogaClass.id = :class")
    List<ClassManager> findById(@Param("class") String yogaclass);
}
