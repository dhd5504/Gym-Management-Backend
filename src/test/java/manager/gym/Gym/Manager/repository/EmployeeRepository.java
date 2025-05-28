package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.staff.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findByName(String name);
}
