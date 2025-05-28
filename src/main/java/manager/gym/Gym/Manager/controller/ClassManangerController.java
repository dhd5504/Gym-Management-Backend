package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.ClassManager;
import manager.gym.Gym.Manager.entity.ClassManagerKey;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import manager.gym.Gym.Manager.service.ClassManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/classManager")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ClassManangerController {

    @Autowired
    private ClassManagerService classManagerService;

    @GetMapping
    public ResponseEntity<List<ClassManager>> getAll(){
        return new ResponseEntity<List<ClassManager>>(classManagerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{classId}")
    public ResponseEntity<List<ClassManager>> getByClassId(@PathVariable String classId){
        return new ResponseEntity<List<ClassManager>>(classManagerService.getByClass(classId), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ClassManager> save(@RequestBody ClassManager classManager){

        return new ResponseEntity<ClassManager>(classManagerService.save(classManager), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Integer> update (@RequestBody ClassManager classManager){
        return new ResponseEntity<Integer>(classManagerService.update(classManager),HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Integer> deleteById (@RequestParam(name = "id") int id){
        return new ResponseEntity<Integer>(classManagerService.delete(id),HttpStatus.OK);
    }
}
