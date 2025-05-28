package manager.gym.Gym.Manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import manager.gym.Gym.Manager.entity.staff.Trainer;
import org.hibernate.Internal;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;

import java.util.Date;

@Entity
@Table(name = "registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer registrationId;

    @ManyToOne
    @JoinColumn(name = "member_Id", referencedColumnName = "member_Id")
    private Member memberId;
    @ManyToOne
    @JoinColumn(name = "membership_Id", referencedColumnName = "membership_Id")
    private Membership membershipId;
    private Date registrationDate;
    private String registrationType;
    @ManyToOne
    @JoinColumn(name = "trainer_id", referencedColumnName = "id")
    private Trainer trainerId;

    public Registration(){

    }
    public Registration(Integer registrationId, Date registrationDate, String registrationType) {
        this.registrationId = registrationId;
//        this.memberId = memberId;
//        this.membershipId = membershipId;
        this.registrationDate = registrationDate;
        this.registrationType = registrationType;
//        this.trainerId = trainerId;
    }

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
        this.memberId = memberId;
    }

    public Membership getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Membership membershipId) {
        this.membershipId = membershipId;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    public Trainer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Trainer trainerId) {
        this.trainerId = trainerId;
    }


}