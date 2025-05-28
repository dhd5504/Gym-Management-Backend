package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Registration;
import manager.gym.Gym.Manager.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationController {
    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public ResponseEntity<List<Registration>> getAllRegistrations(){
        return new ResponseEntity<>(registrationService.getAllRegistration(), HttpStatus.OK);
    }

    @GetMapping("/{registrationId}")
    public ResponseEntity<Registration> getRegistrationById(@PathVariable Integer registrationId){
        return  new ResponseEntity<>(registrationService.getRegistrationById(registrationId),HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity<Registration> createRegistration(@RequestBody Registration registration){
        return new ResponseEntity<>(registrationService.createRegistration(registration),HttpStatus.OK);
    }

    @DeleteMapping("/{registrationId}")
    public void deleteRegistrationById(@PathVariable Integer registrationId){
        registrationService.deleteRegistration(registrationId);
    }

    @PutMapping("/{registrationId}")
    public ResponseEntity<Registration> updateRegistration(@PathVariable Integer registrationId, @RequestBody Registration registration){
        return  new ResponseEntity<>(registrationService.updateRegistration(registrationId, registration),HttpStatus.OK);
    }
}