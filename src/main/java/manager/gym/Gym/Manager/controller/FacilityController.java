package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Facility;

import manager.gym.Gym.Manager.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FacilityController  {
    @Autowired
    private FacilityService facilityService;
    @GetMapping("/facility")
    public ResponseEntity<List<Facility>> getAll(){
        return new ResponseEntity<List<Facility>>(facilityService.getAll(),HttpStatus.OK);
    }
    @GetMapping("/facility/{id}")
    public ResponseEntity<List<Facility>> getByID(@PathVariable int id){
        return new ResponseEntity<List<Facility>>(facilityService.getById(id),HttpStatus.OK);
    }

    @PostMapping("/facility/add")
    public ResponseEntity<String> saveFacility(@RequestBody Facility facility){
        return new ResponseEntity<String>(facilityService.save(facility),HttpStatus.CREATED);
    }

    @PutMapping("/facility/update")
    public ResponseEntity<Integer> updateById(@RequestParam int id, @RequestBody Facility facility){
        return new ResponseEntity<Integer>(facilityService.updateByID(id,facility),HttpStatus.OK);
    }

    @DeleteMapping("/facility/delete")
    public ResponseEntity<Integer> deleteByID(@RequestParam(name = "id") int id){
        return new ResponseEntity<Integer>(facilityService.deleteByID(id),HttpStatus.OK);
    }
}
