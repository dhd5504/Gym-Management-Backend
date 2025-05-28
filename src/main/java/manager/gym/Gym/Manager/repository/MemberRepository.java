package manager.gym.Gym.Manager.repository;

import manager.gym.Gym.Manager.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
