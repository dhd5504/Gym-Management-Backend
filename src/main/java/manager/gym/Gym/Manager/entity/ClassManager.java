package manager.gym.Gym.Manager.entity;
import jakarta.persistence.*;
import manager.gym.Gym.Manager.entity.gym.YogaClass;
import manager.gym.Gym.Manager.entity.staff.GymStaff;

@Entity
public class ClassManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "manager_id", referencedColumnName = "id")
    private GymStaff gymStaff;

    @ManyToOne
    @JoinColumn(name = "gymClass_id", referencedColumnName = "id")
    private YogaClass yogaClass;

    public ClassManager(GymStaff gymStaff,YogaClass yogaClass){
        this.yogaClass = yogaClass;
        this.gymStaff = gymStaff;
    }
    public ClassManager(){

    }

    public GymStaff getGymStaff() {
        return gymStaff;
    }

    public void setGymStaff(GymStaff gymStaff) {
        this.gymStaff = gymStaff;
    }

    public YogaClass getYogaClass() {
        return yogaClass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setYogaClass(YogaClass yogaClass) {
        this.yogaClass = yogaClass;
    }
}
