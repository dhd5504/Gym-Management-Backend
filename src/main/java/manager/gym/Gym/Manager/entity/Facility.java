package manager.gym.Gym.Manager.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import manager.gym.Gym.Manager.entity.gym.YogaClass;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor // constructor using all fields as para
@NoArgsConstructor // constructor using no field as para

public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String facilityName;
    private String type;
    private Date dateOfPurchase;
    private Date warrantyDate;
    private String origin;
    private int quantity;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Date getWarrantyDate() {
        return warrantyDate;
    }

    public void setWarrantyDate(Date warrantyDate) {
        this.warrantyDate = warrantyDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
    public Facility(String facilityName, String type, Date dateOfPurchase,
                    Date warrantyDate, String origin, String status,int quantity){
        super();
        this.facilityName = facilityName;
        this.type = type;
        this.dateOfPurchase = dateOfPurchase;
        this.warrantyDate = warrantyDate;
        this.origin = origin;
        this.status = status;
        this.quantity = quantity;
    }

    public void setFacility(Facility facility){
        this.setFacilityName(facility.getFacilityName());
        this.setType(facility.getType());
        this.setDateOfPurchase(facility.getDateOfPurchase());
        this.setWarrantyDate(facility.getWarrantyDate());
        this.setOrigin(facility.getOrigin());
        this.setStatus(facility.getStatus());
        this.setQuantity(facility.getQuantity());
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    @OneToMany(mappedBy = "facility", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<GymHasFacility> gymClass;
    public List<GymHasFacility> getGymClass() {
        return gymClass;
    }

    public void setGymClass(List<GymHasFacility> gymClass) {
        this.gymClass = gymClass;
    }
}
