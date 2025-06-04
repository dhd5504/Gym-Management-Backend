package manager.gym.Gym.Manager.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Integer memberId;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private String occupation;
    private LocalDateTime birthday;
    private String job;
    private String memberType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @OneToMany(mappedBy = "memberId", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TrainingHistory> trainingHistories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

     public List<TrainingHistory> getTrainingHistories() {
     return trainingHistories;
     }

     public void setTrainingHistories(List<TrainingHistory> trainingHistories) {
     this.trainingHistories = trainingHistories;
     }

    @OneToMany(mappedBy = "memberId", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Feedback> feedbacks;

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    @OneToMany(mappedBy = "memberId", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Registration> registrations;

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }
}
