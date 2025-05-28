package manager.gym.Gym.Manager.entity;

import jakarta.persistence.*;
import manager.gym.Gym.Manager.entity.staff.GymStaff;

@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedbackId;
    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    private Member memberId;

//    @ManyToOne
//    @JoinColumn(name = "staff_id", referencedColumnName = "id")
//    private GymStaff gymStaffId;

    @Column(name = "feedback_content")
    private String feedback_content;

    @Column(name = "feedback_type")
    private Integer feedback_type;

    public Feedback(Integer feedbackId, Member memberId, String feedback_content, Integer feedback_type) {
        this.feedbackId = feedbackId;
        this.memberId = memberId;
//        this.gymStaffId = gymStaffId;
        this.feedback_content = feedback_content;
        this.feedback_type = feedback_type;
    }

    public Feedback() {
        // Constructor mặc định
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
        this.memberId = memberId;
    }

   public String getFeedback_content() {
        return feedback_content;
    }

    public void setFeedback_content(String feedback_content) {
        this.feedback_content = feedback_content;
    }

    public Integer getFeedback_type() {
        return feedback_type;
    }

    public void setFeedback_type(Integer feedback_type) {
        this.feedback_type = feedback_type;
    }
}