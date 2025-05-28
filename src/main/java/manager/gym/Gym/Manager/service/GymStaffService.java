package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Facility;
import manager.gym.Gym.Manager.entity.gym.YogaClass;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import manager.gym.Gym.Manager.repository.GymStaffRepository;
import manager.gym.Gym.Manager.repository.gym.YogaClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class GymStaffService implements IGymStaffService {
    @Autowired
    private GymStaffRepository gymStaffRepository;
    @Override
    public List<GymStaff> getAll() {
        return gymStaffRepository.findAll();
    }

    @Override
    public List<GymStaff> getById( int id) {
        return gymStaffRepository.findByid(id);
    }

    @Override
    public String save(GymStaff gymStaff) {
        gymStaffRepository.save(gymStaff);
        return "Gym staff saved";
    }

    @Override
    public int updateByID(int id, GymStaff gymStaff) {
        GymStaff foundGymStaff = gymStaffRepository.findByid(id).get(0);
        if (foundGymStaff != null) {
            foundGymStaff.setEmployee(gymStaff);
            gymStaffRepository.save(foundGymStaff);
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteByID(int id) {

        List<GymStaff> foundGymStaff = gymStaffRepository.findByid(id);
        if (foundGymStaff.size() > 0 ) {
            gymStaffRepository.delete(foundGymStaff.get(0));
            return 1;
        }
        return 0;
    }
}
