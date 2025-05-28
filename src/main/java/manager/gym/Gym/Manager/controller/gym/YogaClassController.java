package manager.gym.Gym.Manager.controller.gym;

import manager.gym.Gym.Manager.entity.gym.YogaClass;
import manager.gym.Gym.Manager.entity.staff.GymStaff;
import manager.gym.Gym.Manager.service.GymStaffService;
import manager.gym.Gym.Manager.service.YogaClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class YogaClassController {
    @Autowired
    private YogaClassService yogaClassService;

    @GetMapping("/yogaclass")
    public ResponseEntity<List<YogaClass>> getAll(){
        return new ResponseEntity<List<YogaClass>>(yogaClassService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/yogaclass/add")
    public ResponseEntity<String> save(@RequestBody YogaClass yogaClass){

        return new ResponseEntity<String>(yogaClassService.save(yogaClass), HttpStatus.OK);
    }

    @PostMapping("/yogaclass/update")
    public ResponseEntity<Integer> updateByIdAndName(@RequestParam(name = "id") String id, @RequestParam(name = "maximum") int maximumNumber){
        return new ResponseEntity<Integer>(yogaClassService.updateMaximumNumberByID(id,maximumNumber),HttpStatus.OK);
    }

    @DeleteMapping("/yogaclass/delete")  //dang bug: xoa mat ca nhan vien
    public ResponseEntity<Integer> deleteById(@RequestParam(name = "id") String id){
        return new ResponseEntity<Integer>(yogaClassService.deleteByID(id),HttpStatus.OK);
    }

    @PutMapping("/yogaclass/update")
    public  ResponseEntity<Integer> updateClass(@RequestBody YogaClass yogaClass, @RequestParam String id){
        return new ResponseEntity<Integer>(yogaClassService.updateByID(id,yogaClass),HttpStatus.OK);
    }
}
