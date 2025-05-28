package manager.gym.Gym.Manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable

public class GymHasFacilityKey implements Serializable{
    @Column(name = "Gym_id")
    private String gymId;

    @Column(name = "Facility_id")
    private int facilityId;
    public GymHasFacilityKey(){

    }

    public String getGymId() {
        return gymId;
    }

    public void setGymId(String gymId) {
        this.gymId = gymId;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }
}
