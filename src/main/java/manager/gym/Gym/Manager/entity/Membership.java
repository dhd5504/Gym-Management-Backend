package manager.gym.Gym.Manager.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "memberships")
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membership_id")
    private Integer membershipId;
    private String membershipName;
    private String trainingTime;
    private BigDecimal price;
    private Integer pricePerMonth;
    private Integer pricePerDay;
    private Integer numberOfSession;
    private String trainingCardType;
    private Boolean includingTrainer;
    private String trainingClass;
    private String description;

    public Membership() {
    }

    public Membership(String membershipName,
                      String trainingTime,
                      BigDecimal price,
                      Integer pricePerMonth,
                      Integer pricePerDay,
                      Integer numberOfSession,
                      String trainingCardType,
                      Boolean includingTrainer,
                      String trainingClass,
                      String description) {
        this.membershipName = membershipName;
        this.trainingTime = trainingTime;
        this.price = price;
        this.pricePerMonth = pricePerMonth;
        this.pricePerDay = pricePerDay;
        this.numberOfSession = numberOfSession;
        this.trainingCardType = trainingCardType;
        this.includingTrainer = includingTrainer;
        this.trainingClass = trainingClass;
        this.description = description;
    }

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public String getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(String trainingTime) {
        this.trainingTime = trainingTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(Integer pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public Integer getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Integer pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Integer getNumberOfSession() {
        return numberOfSession;
    }

    public void setNumberOfSession(Integer numberOfSession) {
        this.numberOfSession = numberOfSession;
    }

    public String getTrainingCardType() {
        return trainingCardType;
    }

    public void setTrainingCardType(String trainingCardType) {
        this.trainingCardType = trainingCardType;
    }

    public Boolean getIncludingTrainer() {
        return includingTrainer;
    }

    public void setIncludingTrainer(Boolean includingTrainer) {
        this.includingTrainer = includingTrainer;
    }

    public String getTrainingClass() {
        return trainingClass;
    }

    public void setTrainingClass(String trainingClass) {
        this.trainingClass = trainingClass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "membershipId", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Registration> registrations;

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }
}
