package manager.gym.Gym.Manager.entity.staff;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
//import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para

@MappedSuperclass

public abstract class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date dob;
    private String address;
    private String phoneNum;
    private String citizenIdentityID;
    private Date startDate;
    private Date finishContractDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCitizenIdentityID() {
        return citizenIdentityID;
    }

    public void setCitizenIdentityID(String citizenIdentityID) {
        this.citizenIdentityID = citizenIdentityID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishContractDate() {
        return finishContractDate;
    }

    public void setFinishContractDate(Date finishContractDate) {
        this.finishContractDate = finishContractDate;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee( String name, Date dob, String phoneNum, String citizenIdentityID, Date startDate, Date finishContractDate, String address) {

        this.name = name;
        this.dob = dob;
        this.phoneNum = phoneNum;
        this.citizenIdentityID = citizenIdentityID;
        this.startDate = startDate;
        this.finishContractDate = finishContractDate;
        this.address = address;
    }
    public abstract void setEmployee(Employee employee);
}
