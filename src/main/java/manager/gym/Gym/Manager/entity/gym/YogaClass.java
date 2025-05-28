package manager.gym.Gym.Manager.entity.gym;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import manager.gym.Gym.Manager.entity.ClassManager;
import manager.gym.Gym.Manager.entity.Facility;
import manager.gym.Gym.Manager.entity.GymHasFacility;
import manager.gym.Gym.Manager.entity.staff.Employee;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para
public class YogaClass {
    @Id
    @Column(name = "id")
    private String id;
    private String name;
    @OneToMany (mappedBy = "yogaClass", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ClassManager> employee;
    private int maximumNumber;
    private String location;
    private boolean isOccupied;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<ClassManager> getEmployee() {
        return employee;
    }

    public void setEmployee(List<ClassManager> employee) {
        this.employee = employee;
    }

    public int getMaximumNumber() {
        return maximumNumber;
    }

    public void setMaximumNumber(int maximumNumber) {
        this.maximumNumber = maximumNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public YogaClass(String name, int maximumNumber, String id, boolean isOccupied, String location) {
        this.name = name;
        this.maximumNumber = maximumNumber;
        this.isOccupied = isOccupied;
        this.location = location;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClass(YogaClass yogaClass){
        setMaximumNumber(yogaClass.getMaximumNumber());
        setName(yogaClass.getName());
        setLocation(yogaClass.getLocation());
        setOccupied(yogaClass.isOccupied());
    }

    @OneToMany(mappedBy = "gymClass", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<GymHasFacility> facilities;

    public List<GymHasFacility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<GymHasFacility> facilities) {
        this.facilities = facilities;
    }
}
