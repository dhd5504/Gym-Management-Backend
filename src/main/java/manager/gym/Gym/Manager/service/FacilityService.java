package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.Facility;
import manager.gym.Gym.Manager.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private FacilityRepository facilityRepository;

    public String save(Facility facility) {
        facilityRepository.save(facility);
        return "Saved facility";
    }

    @Override
    public int updateByID(@PathVariable int id, @RequestBody Facility facility) {
        Facility foundFacility = getFacility(id);
        if (foundFacility!= null){
            foundFacility.setFacility(facility);
            facilityRepository.save(foundFacility);
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteByID(int id) {
        Facility foundFacility = this.getFacility(id);
        if (foundFacility != null) {
            facilityRepository.deleteById(id);
            return 1;
        }
        return 0;
    }

    @Override
    public List<Facility> getAll() {
        return facilityRepository.findAll();
    }

    @Override
    public List<Facility> getById(int id) {
        return facilityRepository.findByid(id);
    }

    public Facility getFacility(int id){
        List<Facility> found= facilityRepository.findByid(id);
        if (found.size()>0){
            return found.get(0);
        }
        return  null;
    }


}


