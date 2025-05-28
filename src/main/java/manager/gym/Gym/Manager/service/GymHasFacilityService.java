package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.*;
import manager.gym.Gym.Manager.entity.gym.YogaClass;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import manager.gym.Gym.Manager.repository.FacilityRepository;
import manager.gym.Gym.Manager.repository.GymHasFacilityRepository;
import manager.gym.Gym.Manager.repository.gym.YogaClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymHasFacilityService {
    @Autowired
    private final GymHasFacilityRepository gymHasFacilityRepository;
    @Autowired
    private YogaClassRepository yogaClassRepository;
    @Autowired
    private FacilityRepository facilityRepository;
    public GymHasFacilityService(GymHasFacilityRepository gymHasFacilityRepository) {
        this.gymHasFacilityRepository = gymHasFacilityRepository;
    }

    public List<GymHasFacility> getAllGymHasFacility(){
        return gymHasFacilityRepository.findAll();
    }

    public List<GymHasFacility> getGymClass(String id){
        return gymHasFacilityRepository.findClassById(id);
    }

    public List<GymHasFacility> getFacility(int id){
        return gymHasFacilityRepository.findFacilityById(id);
    }

    public GymHasFacility createGymHasFacility(GymHasFacility gymHasFacility) {
        String gymId = gymHasFacility.getGymClass().getId();
        Integer facilityId = gymHasFacility.getFacility().getId();
        GymHasFacilityKey key = new GymHasFacilityKey();
        YogaClass foundClass = yogaClassRepository.findById(gymId).orElse(null);
        Facility foundFacility = facilityRepository.findById(facilityId).orElse(null);
        if (isValid(foundClass, foundFacility)) {
            gymHasFacility.setGymClass(foundClass);
            gymHasFacility.setFacility(foundFacility);
            gymHasFacility.setId(key);
            return gymHasFacilityRepository.save(gymHasFacility);
        }
        return null;
    }
    public int updateGymHasFacility( GymHasFacility gymHasFacility){
        List<GymHasFacility> foundList = gymHasFacilityRepository.findById(gymHasFacility.getFacility().getId(),gymHasFacility.getGymClass().getId());
        if (foundList.size() > 0){
            GymHasFacility foundRecord = foundList.get(0);
            foundRecord.setQuantity(gymHasFacility.getQuantity());
            GymHasFacility success = gymHasFacilityRepository.save(foundRecord);
            return 1;
        }
        return 0;
    }
    public int deleteGymHasFacility(Integer id, String gym){
        List<GymHasFacility> foundList = gymHasFacilityRepository.findById(id,gym);
        if (foundList.size()>0) {
             gymHasFacilityRepository.delete(foundList.get(0));
             return 1;
        }
        return 0;
    }
    private boolean isValid(YogaClass yogaClass, Facility facility){
        return (yogaClass != null && facility != null);
    }
}