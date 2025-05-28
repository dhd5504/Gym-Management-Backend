package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Feedback;
import manager.gym.Gym.Manager.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/feedback")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FeedbackController {
    @Autowired
    private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping
    public ResponseEntity<List<Feedback>> getAllFeedbacks(){
        return new ResponseEntity<>(feedbackService.getAllFeedbacks(), HttpStatus.OK);
    }

    @GetMapping("/{feedbackId}")
    public ResponseEntity<Feedback> getFeedbackById(@PathVariable Integer feedbackId){
        return new ResponseEntity<>(feedbackService.getFeedbackById(feedbackId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Feedback> createFeedback(@RequestBody Feedback feedback){
        return new ResponseEntity<>(feedbackService.createFeedback(feedback), HttpStatus.OK);
    }

    @DeleteMapping("/{feedbackId}")
    public void deleteFeedback(@PathVariable Integer feedbackId){
        feedbackService.deleteFeedback(feedbackId);
    }

    @PutMapping("/{feedbackId}")
    public ResponseEntity<Feedback> updateFeedback(@PathVariable Integer feedbackId, @RequestBody Feedback feedback){
        return new ResponseEntity<>(feedbackService.updateFeedback(feedbackId, feedback),HttpStatus.CREATED);
    }
}