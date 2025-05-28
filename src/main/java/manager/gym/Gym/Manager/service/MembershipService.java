package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Membership;
import manager.gym.Gym.Manager.repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembershipService {

    private final MembershipRepository membershipRepository;

    @Autowired
    public MembershipService(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

    public List<Membership> getAllMemberships() {
        return membershipRepository.findAll();
    }

    public Membership getMembershipById(Integer membershipId) {
        Optional<Membership> optionalMembership = membershipRepository.findById(membershipId);
        return optionalMembership.orElse(null);
    }

    public Membership createMembership(Membership membership) {
        return membershipRepository.save(membership);
    }

    public Membership updateMembership(Integer membershipId, Membership membership) {
        membership.setMembershipId(membershipId);
        return membershipRepository.save(membership);
    }

    public void deleteMembership(Integer membershipId) {
        membershipRepository.deleteById(membershipId);
    }
}
