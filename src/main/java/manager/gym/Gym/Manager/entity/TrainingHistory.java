package manager.gym.Gym.Manager.entity;

import jakarta.persistence.*;
import lombok.ToString;
import manager.gym.Gym.Manager.entity.staff.Trainer;

import java.util.Date;

@Entity
@Table(name = "TRAINING_HISTORY")
public class TrainingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private Date trainingDay;

    private String trainingTime;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainerId;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member memberId;

//    @ManyToOne
//    @JoinColumn(name = "member_id",nullable = false)
//    private Member member;

    public TrainingHistory() {
    }

    public TrainingHistory(Member memberId, Date trainingDay, String trainingTime, Trainer trainerId) {
          this.memberId = memberId;
        this.trainingDay = trainingDay;
        this.trainingTime = trainingTime;
        this.trainerId = trainerId;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
        this.memberId = memberId;
    }

    public Date getTrainingDay() {
        return trainingDay;
    }

    public void setTrainingDay(Date trainingDay) {
        this.trainingDay = trainingDay;
    }

    public String getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(String trainingTime) {
        this.trainingTime = trainingTime;
    }

    public Trainer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Trainer trainerId) {
        this.trainerId = trainerId;
    }

//    public Member getMember() {
//        return member;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }

}
