package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Member;
import manager.gym.Gym.Manager.entity.Membership;
import manager.gym.Gym.Manager.entity.Registration;
import manager.gym.Gym.Manager.entity.staff.Trainer;
import manager.gym.Gym.Manager.repository.MemberRepository;
import manager.gym.Gym.Manager.repository.MembershipRepository;
import manager.gym.Gym.Manager.repository.RegistrationRepository;
import manager.gym.Gym.Manager.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {
    private final RegistrationRepository registrationRepository;
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private MembershipRepository membershipRepository;
    @Autowired
    private TrainerRepository trainerRepository;
    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository){
        this.registrationRepository = registrationRepository;
    }

    public List<Registration> getAllRegistration(){
        return registrationRepository.findAll();
    }

    public Registration getRegistrationById(Integer id){
        return registrationRepository.findById(id)
                .orElse(null);
    }

    public Registration createRegistration(Registration registration){
        int memberId = registration.getMemberId().getMemberId();
        int membershipId = registration.getMembershipId().getMembershipId();
        int trainerId = registration.getTrainerId().getId();

        Member foundMember = memberRepository.findById(memberId).orElse(null);
        Membership foundMembership = membershipRepository.findById(membershipId).orElse(null);
        Trainer foundTrainer = trainerRepository.findById(trainerId).get(0);

        registration.setMemberId(foundMember);
        registration.setMembershipId(foundMembership);
        registration.setTrainerId(foundTrainer);
        return registrationRepository.save(registration);
    }

    public void deleteRegistration(Integer id){
        registrationRepository.deleteById(id);
    }

    public Registration updateRegistration(Integer registrationId, Registration registration) {
        registration.setRegistrationId(registrationId);
        return registrationRepository.save(registration);
    }
}