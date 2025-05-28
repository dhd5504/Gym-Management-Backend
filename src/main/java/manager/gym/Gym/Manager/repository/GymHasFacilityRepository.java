package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.Facility;
import manager.gym.Gym.Manager.entity.GymHasFacility;
import manager.gym.Gym.Manager.entity.gym.YogaClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GymHasFacilityRepository extends JpaRepository<GymHasFacility, Integer> {
    @Query(value = "SELECT u FROM GymHasFacility u WHERE u.gymClass.id = :id")
    List<GymHasFacility> findClassById(@Param("id") String id);

    @Query(value = "SELECT u FROM GymHasFacility u WHERE u.facility.id = :id")
    List<GymHasFacility> findFacilityById(@Param("id") int id);

    @Query(value = "SELECT u FROM GymHasFacility u WHERE u.facility.id = :id AND u.gymClass.id = :gym")
    List<GymHasFacility> findById(@Param("id") int id, @Param("gym") String gym);
    @Query(value = "DELETE FROM GymHasFacility u WHERE u.facility.id = :id AND u.gymClass.id = :gym", nativeQuery = true)
    void deleteByFacilityIdGymId(@Param("id") int id, @Param("gym") String gym);

}