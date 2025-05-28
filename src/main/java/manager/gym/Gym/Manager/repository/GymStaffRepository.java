package manager.gym.Gym.Manager.repository;

import jakarta.persistence.Table;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Table(name = "GYM_STAFF")
public interface GymStaffRepository extends JpaRepository<GymStaff, Integer> {
    List<GymStaff> findByid(int id);
}
