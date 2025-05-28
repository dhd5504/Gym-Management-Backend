package manager.gym.Gym.Manager.repository.gym;

import manager.gym.Gym.Manager.entity.gym.YogaClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YogaClassRepository extends JpaRepository<YogaClass,String> {
    @Query(value = "SELECT u FROM YogaClass u WHERE u.id = :id")
    List<YogaClass> findClassById(@Param("id") String id);


}
