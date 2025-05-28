package manager.gym.Gym.Manager.entity.staff;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import manager.gym.Gym.Manager.entity.Registration;
import manager.gym.Gym.Manager.entity.TrainingHistory;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "TRAINER")
public class Trainer extends Employee{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String trainerType;

    public String getTrainerType() {
        return trainerType;
    }

    public void setTrainerType(String trainerType) {
        this.trainerType = trainerType;
    }

    public List<TrainingHistory> getTrainingHistoryList() {
        return trainingHistoryList;
    }

    public void setTrainingHistoryList(List<TrainingHistory> trainingHistoryList) {
        this.trainingHistoryList = trainingHistoryList;
    }

    @OneToMany (mappedBy = "trainerId", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TrainingHistory> trainingHistoryList;

    public Trainer(String name, Date dob, String workingFaculty, String phoneNum, String citizenIdentityID, Date startDate, Date finishContractDate, String trainerType, String address) {
        super(name, dob, phoneNum, citizenIdentityID, startDate, finishContractDate, address);
        this.trainerType = trainerType;
    }

    @Override
    public void setEmployee(Employee employee) {
        Trainer trainer = (Trainer) employee;
        this.setName(trainer.getName());
        this.setDob(trainer.getDob());
        this.setPhoneNum(trainer.getPhoneNum());
        this.setCitizenIdentityID(trainer.getCitizenIdentityID());
        this.setStartDate(trainer.getStartDate());
        this.setFinishContractDate(trainer.getFinishContractDate());
        this.setTrainerType(trainer.getTrainerType());
    }

    @OneToMany (mappedBy = "trainerId", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Registration> registrations;

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }
}
