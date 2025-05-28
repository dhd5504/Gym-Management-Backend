package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.ClassManager;
import manager.gym.Gym.Manager.entity.ClassManagerKey;
import manager.gym.Gym.Manager.entity.gym.YogaClass;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import manager.gym.Gym.Manager.repository.ClassManagerRepository;
import manager.gym.Gym.Manager.repository.GymStaffRepository;
import manager.gym.Gym.Manager.repository.gym.YogaClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassManagerService {
    @Autowired
    private ClassManagerRepository classManagerRepository;
    @Autowired
    private GymStaffRepository gymStaffRepository;
    @Autowired
    private YogaClassRepository yogaClassRepository;

    public List<ClassManager> getAll (){
        return classManagerRepository.findAll();
    }
    public ClassManager save (ClassManager classManager){
        String id = classManager.getYogaClass().getId();
        int employee_id = classManager.getGymStaff().getId();
        YogaClass yogaClass = yogaClassRepository.findClassById(id).get(0);
        GymStaff gymStaff = gymStaffRepository.findByid(employee_id).get(0);
        classManager.setYogaClass(yogaClass);
        classManager.setGymStaff(gymStaff);
        return classManagerRepository.save(classManager);
    }

    public List<ClassManager> getByClass(String classId){
        return classManagerRepository.findById(classId);
    }

    public int update(ClassManager classManager){
        String yogaClass = classManager.getYogaClass().getId();
        int manager_id = classManager.getGymStaff().getId();

        List<ClassManager> found = classManagerRepository.findById(yogaClass);
        if (found.size() > 0) {
            ClassManager foundResult = found.get(0);
            GymStaff foundStaff = gymStaffRepository.findByid(manager_id).get(0);
            if (foundStaff != null){
                foundResult.setGymStaff(foundStaff);
                classManagerRepository.save(foundResult);
                return 1;
            }
        }
        return 0;
    }

    public int delete (int id){
        ClassManager found = classManagerRepository.findById(id).orElse(null);
        if(found != null){
            classManagerRepository.delete(found);
            return 1;
        }
        return 0;
    }
}
