package manager.gym.Gym.Manager.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import manager.gym.Gym.Manager.entity.gym.YogaClass;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class GymHasFacility {
    @EmbeddedId
    @GeneratedValue
    private GymHasFacilityKey id;

    public GymHasFacilityKey getId() {
        return id;
    }

    public void setId(GymHasFacilityKey id) {
        this.id = id;
    }

    @ManyToOne
    @MapsId("gymId")
//    @JsonBackReference
    @JoinColumn(name = "Gym_id")
//    @JsonBackReference
    private YogaClass gymClass;
    @ManyToOne
    @MapsId("facilityId")
//    @JsonBackReference
    @JoinColumn(name = "Facility_id")
//    @JsonBackReference
    private  Facility facility;

    public YogaClass getGymClass() {
        return gymClass;
    }

    public void setGymClass(YogaClass gymClass) {
        this.gymClass = gymClass;
    }

    public GymHasFacility(GymHasFacilityKey id, YogaClass gymClass, Facility facility, int quantity) {
//        this.id = id;
        this.gymClass = gymClass;
        this.facility = facility;
        this.quantity = quantity;
    }
    public GymHasFacility(){

    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public GymHasFacilityKey getId() {
//        return id;
//    }
//
//    public void setId(GymHasFacilityKey id) {
//        this.id = id;
//    }

    private int quantity;
}
