package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.TrainingHistory;
import manager.gym.Gym.Manager.service.TrainingHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainingHistories")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainingHistoryController {
    private final TrainingHistoryService trainingHistoryService;

    @Autowired
    public TrainingHistoryController(TrainingHistoryService trainingHistoryService) {
        this.trainingHistoryService = trainingHistoryService;
    }

    @GetMapping
    public ResponseEntity<List<TrainingHistory>> getAllTrainingHistories() {
        return new ResponseEntity<>(trainingHistoryService.getAllTrainingHistories(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrainingHistory> getTrainingHistoryById(@PathVariable Integer id) {
        return new ResponseEntity<>(trainingHistoryService.getTrainingHistoryById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TrainingHistory> createTrainingHistory(@RequestBody TrainingHistory trainingHistory) {
        return new ResponseEntity<>( trainingHistoryService.createTrainingHistory(trainingHistory),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TrainingHistory> updateTrainingHistory(@PathVariable Integer id, @RequestBody TrainingHistory trainingHistory) {
        return new ResponseEntity<>( trainingHistoryService.updateTrainingHistory(id, trainingHistory),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteTrainingHistory(@PathVariable Integer id) {
        trainingHistoryService.deleteTrainingHistory(id);
    }
}
