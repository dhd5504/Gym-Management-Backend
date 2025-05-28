package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, Integer> {
    public List<Facility> findByid(int id);

}
