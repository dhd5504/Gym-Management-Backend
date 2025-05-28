package manager.gym.Gym.Manager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ClassManagerKey implements Serializable {
    @Column(name = "gymClass")
    private String gymId;

    @Column(name = "manager")
    private int managerId;
    public  ClassManagerKey(){

    }
    public String getGymId() {
        return gymId;
    }

    public void setGymId(String gymId) {
        this.gymId = gymId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }
}
