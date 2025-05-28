package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.GymHasFacility;
import manager.gym.Gym.Manager.service.GymHasFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gymhasfacility")
@CrossOrigin(origins = "http://localhost:3000")
public class GymHasFacilityController {
    @Autowired
    private final GymHasFacilityService gymHasFacilityService;

    public GymHasFacilityController(GymHasFacilityService gymHasFacilityService) {
        this.gymHasFacilityService = gymHasFacilityService;
    }
    @GetMapping
    public ResponseEntity<List<GymHasFacility>> getAllGymHasFacility(){
        return new ResponseEntity<List<GymHasFacility>>(gymHasFacilityService.getAllGymHasFacility(), HttpStatus.OK);
    }

    @GetMapping("/getclass")
    public ResponseEntity<List<GymHasFacility>> getGymHasFacilityByGymClass(@RequestParam(name = "gym") String gym){
        return new ResponseEntity<List<GymHasFacility>>(gymHasFacilityService.getGymClass(gym),HttpStatus.OK);
    }
    @GetMapping("/getfacility")
    public ResponseEntity<List<GymHasFacility>> getGymHasFacilityByFacility(@RequestParam(name = "facility") int id){
        return new ResponseEntity<List<GymHasFacility>>(gymHasFacilityService.getFacility(id),HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<GymHasFacility> createGymHasFacility(@RequestBody GymHasFacility gymHasFacility){
        GymHasFacility created = gymHasFacilityService.createGymHasFacility(gymHasFacility);
        return new ResponseEntity<GymHasFacility>(created,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Integer> updateGymHasFacility( @RequestBody GymHasFacility gymHasFacility){
        return new ResponseEntity<>(gymHasFacilityService.updateGymHasFacility(gymHasFacility),HttpStatus.OK);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Integer> deleteGymHasFacilityById(@RequestParam(name = "gym") String gym, @RequestParam(name = "facility") int id){
       return new ResponseEntity<>(gymHasFacilityService.deleteGymHasFacility(id,gym),HttpStatus.OK);
    }
}