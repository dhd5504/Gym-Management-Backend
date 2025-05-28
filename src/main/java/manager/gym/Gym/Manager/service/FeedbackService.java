package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Feedback;
import manager.gym.Gym.Manager.entity.Member;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import manager.gym.Gym.Manager.repository.FeedbackRepository;
import manager.gym.Gym.Manager.repository.GymStaffRepository;
import manager.gym.Gym.Manager.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    private final FeedbackRepository feedbackRepository;
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private GymStaffRepository gymStaffRepository;

    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }


    public List<Feedback> getAllFeedbacks(){
        return feedbackRepository.findAll();
    }

    public Feedback getFeedbackById(Integer id){
        return feedbackRepository.findById(id)
                .orElse(null);
    }

    public Feedback createFeedback(Feedback feedback){
        int memberId = feedback.getMemberId().getMemberId();
//        int gymStaffId = feedback.getGymStaffId().getId();

        Member foundMember = memberRepository.findById(memberId).orElse(null);
//        GymStaff foundGymStaff = gymStaffRepository.findByid(gymStaffId).get(0);

        feedback.setMemberId(foundMember);
//        feedback.setGymStaffId(foundGymStaff);
        return feedbackRepository.save(feedback);
    }

    public void deleteFeedback(Integer id){
        feedbackRepository.deleteById(id);
    }

    public Feedback updateFeedback(Integer feedbackId, Feedback feedback) {
        feedback.setFeedbackId(feedbackId);
        return feedbackRepository.save(feedback);
    }
}