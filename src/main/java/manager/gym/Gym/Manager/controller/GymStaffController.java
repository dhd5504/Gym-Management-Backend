package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.staff.GymStaff;
import manager.gym.Gym.Manager.service.GymStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GymStaffController {
    @Autowired
    private GymStaffService gymStaffService;
//    @GetMapping("/")
//    public ResponseEntity<String> index(){
//        return new ResponseEntity<String>("Server running oke",HttpStatus.OK);
//    }

    @GetMapping("/gymstaff")
    public ResponseEntity<List<GymStaff>> getAll() {
        return new ResponseEntity<List<GymStaff>>(gymStaffService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/gymstaff/{id}")
    public ResponseEntity<List<GymStaff>> getByID(@PathVariable int id) {
        return new ResponseEntity<List<GymStaff>>(gymStaffService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/gymstaff/add")
    public ResponseEntity<String> saveGymStaff(@RequestBody GymStaff gymStaff) {
        return new ResponseEntity<String>(gymStaffService.save(gymStaff), HttpStatus.OK);
    }

    @PutMapping("/gymstaff/update")
    public ResponseEntity<Integer> updateById(@RequestParam int id, @RequestBody GymStaff gymStaff) {
        return new ResponseEntity<Integer>(gymStaffService.updateByID(id, gymStaff), HttpStatus.OK);
    }

    @DeleteMapping("/gymstaff/delete")
    public ResponseEntity<Integer> deleteByID(@RequestParam(name = "id") int id) {
        return new ResponseEntity<Integer>(gymStaffService.deleteByID(id), HttpStatus.OK);
    }

}
