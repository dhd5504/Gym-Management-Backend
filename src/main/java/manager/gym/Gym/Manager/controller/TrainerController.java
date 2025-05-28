package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.staff.Trainer;
import manager.gym.Gym.Manager.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainerController {
    @Autowired
    private TrainerService trainerService;

    @GetMapping("/trainer")
    public ResponseEntity<List<Trainer>> getAll(){
        return new ResponseEntity<List<Trainer>>(trainerService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/trainer/{id}")
    public ResponseEntity<List<Trainer>> getByID(@PathVariable int id){
        return new ResponseEntity<List<Trainer>>(trainerService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/trainer/add")
    public  ResponseEntity<String> save(@RequestBody Trainer trainer){
        return new ResponseEntity<String>(trainerService.save(trainer),HttpStatus.CREATED);
    }

    @PutMapping("/trainer/update")
    public  ResponseEntity<Integer> updateById(@RequestParam int id, @RequestBody Trainer trainer){
        return new ResponseEntity<Integer>(trainerService.updateByID(id,trainer),HttpStatus.CREATED);
    }

    @DeleteMapping("/trainer/delete")
    public ResponseEntity<Integer> deleteByID(@PathVariable int id){
        return new ResponseEntity<Integer>(trainerService.deleteByID(id), HttpStatus.OK);
    }
}
