package manager.gym.Gym.Manager.entity.staff;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import manager.gym.Gym.Manager.entity.ClassManager;

import java.util.Date;
import java.util.List;

@Entity
 @AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class GymStaff extends Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String role;
    private String workingFaculty;

    @OneToMany(mappedBy = "gymStaff", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ClassManager> classManager;

    @JsonIgnore
    public List<ClassManager> getYogaClass() {
        return classManager;
    }
    @JsonProperty
    public void setYogaClass(List<ClassManager> classManager) {
        this.classManager = classManager;
    }

    public String getWorkingFaculty() {
        return workingFaculty;
    }

    public void setWorkingFaculty(String workingFaculty) {
        this.workingFaculty = workingFaculty;
    }

    public GymStaff(String name, Date dob, String workingFaculty, String phoneNum, String citizenIdentityID,
            Date startDate, Date finishContractDate, String role, String address) {
        super(name, dob, phoneNum, citizenIdentityID, startDate, finishContractDate, address);
        this.role = role;
        this.workingFaculty = workingFaculty;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void setEmployee(Employee employee) {
        GymStaff gymStaff = (GymStaff) employee;
        this.setName(gymStaff.getName());
        this.setDob(gymStaff.getDob());
        this.setWorkingFaculty(gymStaff.getWorkingFaculty());
        this.setPhoneNum(gymStaff.getPhoneNum());
        this.setCitizenIdentityID(gymStaff.getCitizenIdentityID());
        this.setStartDate(gymStaff.getStartDate());
        this.setFinishContractDate(gymStaff.getFinishContractDate());
        this.setRole(gymStaff.getRole());
    }

}
