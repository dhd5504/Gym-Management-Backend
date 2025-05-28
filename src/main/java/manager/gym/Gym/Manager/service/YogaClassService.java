package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.gym.YogaClass;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import manager.gym.Gym.Manager.repository.GymStaffRepository;
import manager.gym.Gym.Manager.repository.gym.YogaClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YogaClassService implements IYogaClassService {
    @Autowired
    private YogaClassRepository yogaClassRepository;
    @Override
    public List<YogaClass> getAll() {
        return yogaClassRepository.findAll();
    }

    @Override
    public List<YogaClass> getById(int id) {
        return null;
    }

    public List<YogaClass> getById(String id) {
        return yogaClassRepository.findClassById(id);
    }


    @Override
    public String save(YogaClass yogaClass) {
        YogaClass savedYogaClass = yogaClassRepository.save(yogaClass);
        return (savedYogaClass.getId()+" created");
    }

    @Override
    public int updateByID(int id, YogaClass yogaClass) {
        YogaClass foundYogaClass = getById(id).get(0);
        System.out.println(yogaClass.getName());
        if (foundYogaClass != null){
            foundYogaClass.setClass(yogaClass);
            YogaClass updated = yogaClassRepository.save(foundYogaClass);
            return 1;
        }
        return 0;

    }


    public int updateMaximumNumberByID(String id, int maximumNumber) {
        YogaClass foundYogaClass = yogaClassRepository.findClassById(id).get(0);
        if (foundYogaClass != null){
            foundYogaClass.setMaximumNumber(maximumNumber);
            YogaClass updated = yogaClassRepository.save(foundYogaClass);
            return 1;
        }
        return 0;
    }
    public int updateByID(String id, YogaClass yogaClass) {


        YogaClass foundYogaClass = this.findClass(id);
        if (foundYogaClass != null){
                foundYogaClass.setClass(yogaClass);
                YogaClass updated = yogaClassRepository.save(foundYogaClass);
                return 1;
        }
        return 0;
    }

    @Override
    public int deleteByID(int id) {
        return 0;
    }

    public int deleteByID(String id){
        YogaClass foundYogaClass = findClass(id);
        if (foundYogaClass != null){
            yogaClassRepository.delete(foundYogaClass);
            return 1;
        }
        return 0;
    }

    private YogaClass findClass(String id){
       List<YogaClass> found = yogaClassRepository.findClassById(id);
       if (found.size() > 0){
           return found.get(0);
       }
       return null;
    }



}
